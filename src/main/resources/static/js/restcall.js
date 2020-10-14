var makeRequest = function (url, method) {

    console.log("make reqeust")
    // Create the XHR request
    var request = new XMLHttpRequest();
    //request.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
    // Return it as a Promise
    return new Promise(function (resolve, reject) {

        // Setup our listener to process compeleted requests
        request.onreadystatechange = function () {

            // Only run if the request is complete
            if (request.readyState !== 4) return;

            // Process the response
            if (request.status >= 200 && request.status < 300) {
                // If successful
                resolve(request);
            } else {
                // If failed
                reject({
                    status: request.status,
                    statusText: request.statusText
                });
            }

        };


        var usertext = document.getElementById('textareainput');

        var formdata= new FormData();
        formdata.append("text",usertext.value);

        // Setup our HTTP request
        request.open(method || 'POST', url, true);

        var apirequest = "{\"text\":\"hello\",\"language\":null,\"voice\":null}";
        request.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
        // Send the request
        var requestBody = JSON.stringify(Object.fromEntries(formdata));
        request.send(requestBody);
    });
};





