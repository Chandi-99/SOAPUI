
1. Install SOAP UI in your computer.

2. Make sure you have java installed

3. Make sure port 8080 is free

4. Run webservice.jar using " java -jar webservices.jar "

5. Import REST Project REST-Project-3-soapui-project.xml in SOAP UI

6. Make sure your webservices is up and running and REST Project 1-soapui-project.xml also successfully imported

7. Now you can send place order request and get order status request through SOAPUI. Additionally you can update order status as well

Java Version 1.8

All Web APIs are REST APIs

placeOrder path - : http://localhost:8080/place-order
            body  :- 	{
            		  "productId":"2"
            		}

getOrderStatus path - : http://localhost:8080/get-order-status/{orderId}

updateOrderStatus path - : http://localhost:8080/update-order-status/{orderId}/{statusCode}

order Status Code:
	C = Confirm
	D = Delivered
	I = Invalid
	O = Out for Delivery
