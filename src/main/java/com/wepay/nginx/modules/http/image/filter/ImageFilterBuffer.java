/********************************************************** 
* Syntax: image_filter_buffer size;
* Default: image_filter_buffer 1M;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.image.filter;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ImageFilterBuffer extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ImageFilterBuffer() {
		super(contexts, "1M", "image_filter_buffer");
	}

}
