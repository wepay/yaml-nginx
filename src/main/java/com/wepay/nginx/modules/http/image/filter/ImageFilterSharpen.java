/********************************************************** 
* Syntax: image_filter_sharpen percent;
* Default: image_filter_sharpen 0;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.image.filter;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ImageFilterSharpen extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP,SERVER,LOCATION);
	}
	public ImageFilterSharpen() {
		super(contexts, "0", "image_filter_sharpen");
	}

}
