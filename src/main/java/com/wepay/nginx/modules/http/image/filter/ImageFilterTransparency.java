/********************************************************** 
* Syntax: image_filter_transparency on|off;
* Default: image_filter_transparency on;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.image.filter;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ImageFilterTransparency extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ImageFilterTransparency() {
		super(contexts, "on", "image_filter_transparency");
	}

}
