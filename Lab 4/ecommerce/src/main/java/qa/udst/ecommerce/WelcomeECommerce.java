/*
 • Name: Ahmed Khawaja  
 • Student ID: 60104808  
 • Created On 21-09-2025-08h-45m
*/

package qa.udst.ecommerce;

import qa.udst.ecommerce.model.*;
// import java.util.*;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.JsonSerializable.Base;

@SpringBootApplication
@SpringBootConfiguration

public class WelcomeECommerce {
    public static void main(String[] args) {
        System.out.println("Hi");

        Test test = new Test();
        System.out.println(test.getName());

    }

}
