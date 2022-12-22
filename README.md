Repository contains example how to return Multipart response in Spring Web MVC.
It is really rare, but sometime occurs in web-services. 

The key idea that we can use a Mulitpart client library to generate the response. 
This example uses [httmime](https://hc.apache.org/httpcomponents-client-4.5.x/current/httpmime/apidocs/) library, 
which is the part of Apache http client.

Useful links:
*  [rfc1341](https://www.w3.org/Protocols/rfc1341/7_2_Multipart.html) - 7.2 Multipart
*  [httpmime example](https://github.com/apache/httpcomponents-client/blob/master/httpclient5/src/test/java/org/apache/hc/client5/http/examples/ClientMultipartFormPost.java) - see for more complex usage, like adding binary 

