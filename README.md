# yaml-nginx

 	This is a java library which generates configuration file in nginx format from YAML. 
 	It supports the directives of [nginx-1.13.8](https://nginx.org/en/docs)
 	
 	Configuration blocks could be generated at different levels as shown below.
 	
 	* main:  generates main nginx.conf file content.
 	* http: generates http blocks.
 	* server: generates server blocks.
 	* location:  generates location blocks.
 	
 	Input configuration file is more of a key:value paired structure specified in yaml format. 
 	All the keys are derived from [Nginx directives](https://nginx.org/en/docs) and should be unique. 
 	Some of the keys( like if, location, server... etc) which could have more than one values are specified as list using the key "<directive_name>s". 
 	See [here](src/test/java/com/wepay/nginx/resources) for more example configurations.
 	
## Usage
config.yml
	 
	server:
	  open_file_cache_errors: "off" 
	  server_name_in_redirect:  
	    value: "off"  
	  server_name: "xyz" 
	  locations:
	    - url: "/home/dist"
	      open_file_cache_errors: "on" 
	    - url: "/home/dist/latest"
	      open_file_cache_errors: "off" 
	 
Code snippet:
 
	 import com.wepay.nginx.NginxFormatter;
	 .
	 .
	 String res = NginxFormatter.format("config.yml", "http");
	 System.out.println(res)
 
 
Result:

	http {
	    server {
	        location /home/dist {
	            open_file_cache_errors    on;
	        }
	        location /home/dist/latest {
	            open_file_cache_errors    off;
	        }
	        open_file_cache_errors    off;
	        server_name               xyz;
	        server_name_in_redirect   off;
	    }
	}
 
**Note:** This library uses com.fasterxml.jackson.databind.ObjectMapper class. Values like "on" and "off" should always be surrounded with double quotes since objectMapper internally treats them as "true" and "false" respectively.

## Requirements
	JDK 1.8+
	
## Build Instructions
   ./gradlew build
   
#### [Artifactory Library](https://artifactory.devops.wepay-inc.com/artifactory/webapp/#/artifacts/browse/tree/General/libs-release-local/com/wepay/yaml-nginx)
 	
