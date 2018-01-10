/********************************************************** 
* Syntax: image_filter_interlace on | off;
* Default: image_filter_interlace off;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.image.filter;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ImageFilterInterlace extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ImageFilterInterlace() {
		super(contexts, "off", "image_filter_interlace");
	}

}
