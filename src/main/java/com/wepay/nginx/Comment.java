package com.wepay.nginx;

import java.util.Arrays;

public class Comment extends Directive{
	public Comment() {
		super(Arrays.asList("ANY"), null, "comment");
	}
}
