/********************************************************** 
* Syntax: image_filter_webp_quality quality;
* Default: image_filter_webp_quality 80;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.image.filter;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ImageFilterWebpQuality extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ImageFilterWebpQuality() {
		super(contexts, "80", "image_filter_webp_quality");
	}

}
