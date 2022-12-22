package com.vygovskiy.spring.multipart

import org.apache.commons.lang3.RandomStringUtils
import org.apache.http.entity.mime.MultipartEntityBuilder
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import javax.servlet.http.HttpServletResponse

@Controller
class MultipartResponseController {

    companion object {
        fun makeBoundary(): String =
             RandomStringUtils.random(32,"-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
    }

    /**
     * Based on:
     *  - https://www.w3.org/Protocols/rfc1341/7_2_Multipart.html
     *  - https://github.com/apache/httpcomponents-client/blob/master/httpclient5/src/test/java/org/apache/hc/client5/http/examples/ClientMultipartFormPost.java
     */
    @GetMapping("/")
    fun get(response : HttpServletResponse) {

        val boundary = makeBoundary()
        response.setHeader("Content-type", "multipart/mixed; boundary=\"$boundary\"")



        val multipart = MultipartEntityBuilder.create()
            .setBoundary(boundary)
            .addTextBody("first.txt","hello")
            .addTextBody("second.txt","multipart")
            .build();


        multipart.writeTo(response.outputStream)
    }
}