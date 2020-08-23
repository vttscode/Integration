Integration for table Beneficiary

1.Download and install PostgreSQL:
https://www.postgresql.org/download/
Create database crud.

2.Start application.

3.Open localhost:8080

4. Write request in browser console :

    // Example (Create) POST method implementation:
    async function postData(url = '', data = {}) {
      // Default options are marked with *
      const response = await fetch(url, {
        method: 'POST', // POST, PUT, DELETE, etc.
        mode: 'cors', // no-cors, *cors, same-origin
        cache: 'no-cache', // *default, no-cache, reload, force-cache, only-if-cached
        credentials: 'same-origin', // include, *same-origin, omit
        headers: {
          'Content-Type': 'application/json'
          // 'Content-Type': 'application/x-www-form-urlencoded',
        },
        redirect: 'follow', // manual, *follow, error
        referrerPolicy: 'no-referrer', // no-referrer, *no-referrer-when-downgrade, origin, origin-when-cross-origin, same-origin, strict-origin, strict-origin-when-cross-origin, unsafe-url
        body: JSON.stringify(data) // body data type must match "Content-Type" header
      });
      return response.json(); // parses JSON response into native JavaScript objects
    }    
    postData('/beneficiary', { uniqCode:"N",name:"Natalie" })
      .then(data => {
        console.log(data); // JSON data parsed by `data.json()` call
      });
      
      Read all data:
      http://localhost:8080/beneficiary
      
      Get on by ID:
      http://localhost:8080/beneficiary/1
      
      // Example (Update) PUT method implementation:
          async function postData(url = '', data = {}) {
            // Default options are marked with *
            const response = await fetch(url, {
              method: 'PUT', // POST, PUT, DELETE, etc.
              mode: 'cors', // no-cors, *cors, same-origin
              cache: 'no-cache', // *default, no-cache, reload, force-cache, only-if-cached
              credentials: 'same-origin', // include, *same-origin, omit
              headers: {
                'Content-Type': 'application/json'
                // 'Content-Type': 'application/x-www-form-urlencoded',
              },
              redirect: 'follow', // manual, *follow, error
              referrerPolicy: 'no-referrer', // no-referrer, *no-referrer-when-downgrade, origin, origin-when-cross-origin, same-origin, strict-origin, strict-origin-when-cross-origin, unsafe-url
              body: JSON.stringify(data) // body data type must match "Content-Type" header
            });
            return response.json(); // parses JSON response into native JavaScript objects
          }          
          postData('/beneficiary/1', { uniqCode:"1M",name:"Martin" })
            .then(data => {
              console.log(data); // JSON data parsed by `data.json()` call
            });
          
      // Example (Delete) DELETE method implementation:
                async function postData(url = '', data = {}) {
                  // Default options are marked with *
                  const response = await fetch(url, {
                    method: 'DELETE', // POST, PUT, DELETE, etc.
                    mode: 'cors', // no-cors, *cors, same-origin
                    cache: 'no-cache', // *default, no-cache, reload, force-cache, only-if-cached
                    credentials: 'same-origin', // include, *same-origin, omit
                    headers: {
                      'Content-Type': 'application/json'
                      // 'Content-Type': 'application/x-www-form-urlencoded',
                    },
                    redirect: 'follow', // manual, *follow, error
                    referrerPolicy: 'no-referrer', // no-referrer, *no-referrer-when-downgrade, origin, origin-when-cross-origin, same-origin, strict-origin, strict-origin-when-cross-origin, unsafe-url
                    body: JSON.stringify(data) // body data type must match "Content-Type" header
                  });
                  return response.json(); // parses JSON response into native JavaScript objects
                }                
                postData('/beneficiary/1', {})
                  .then(data => {
                    console.log(data); // JSON data parsed by `data.json()` call
                  });    
            
      

