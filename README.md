Repository contains example of returing Multipart response. 
It is really rare case used in web-services. 

The key idea that we can use Mulitpart client library to generate response. 
Example use [httmime](https://hc.apache.org/httpcomponents-client-4.5.x/current/httpmime/apidocs/) library, 
which is part of Apache http client.

Example is based on next articles and examples:
*  [rfc1341](https://www.w3.org/Protocols/rfc1341/7_2_Multipart.html) - 7.2 Multipart
*  [httpmime example](https://github.com/apache/httpcomponents-client/blob/master/httpclient5/src/test/java/org/apache/hc/client5/http/examples/ClientMultipartFormPost.java) - see for more complex usage, like adding binary 

