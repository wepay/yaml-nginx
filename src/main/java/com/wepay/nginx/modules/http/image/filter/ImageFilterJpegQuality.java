/********************************************************** 
* Syntax: image_filter_jpeg_quality quality;
* Default: image_filter_jpeg_quality 75;
* Context: http, server, location    
**********************************************************/
package com.wepay.nginx.modules.http.image.filter;

import static com.wepay.nginx.Constants.*;

import java.util.*;

import com.wepay.nginx.Directive;

public class ImageFilterJpegQuality extends Directive {
	static final List<String> contexts;
	static {
		contexts = Arrays.asList(HTTP, SERVER, LOCATION);
	}

	public ImageFilterJpegQuality() {
		super(contexts, "75", "image_filter_jpeg_quality");
	}

}
