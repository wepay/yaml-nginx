/********************************************************** 
* Syntax: image_filter off;
* Default: image_filter off;
* Context: location    
**********************************************************/
package com.wepay.nginx.modules.http.image.filter;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ImageFilter extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(LOCATION);
	}

	public ImageFilter() {
		super(contexts, "off", "image_filter");
	}

}
