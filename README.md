# OrderProcessingService
Order Validation Service to validate the order

The service has an endpoint "/validate" which validates the user input and checks for orderId , mobile number, email address etc. 

It returns true if validation is processed successfully. If validation fails then it returns false.

This service will run on port 8082 on your local and below are the details to run on your local.

URL:-http://localhost:8082/validate
method:- POST
Request:-
{
            "orderId":123459,
            "phoneNumber":"9784977949",
            "emailAddress":"pspooja@gmail.com"
}
# Installation
To install this service, clone this repository and import it as maven project in any available IDE (Eclipse/IntelliJ) 

# Usage
Run OrderDetailsApplication class (Run as Java Application) and it will start the service on port 8082.

# License
This project is licensed under GENPACT.
