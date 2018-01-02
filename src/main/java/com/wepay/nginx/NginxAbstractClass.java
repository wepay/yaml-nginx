package com.wepay.nginx;

import static com.wepay.nginx.Constants.COMMENT_PRINT_FORMAT;

import java.util.List;

import com.wepay.nginx.helper.NginxHelper;

public abstract class NginxAbstractClass<T> implements IContext, Defaults, Dumps<T> {

	private List<String> contexts;
	private String defaultValue;
	private String classAnnotation;

	public NginxAbstractClass(List<String> contexts, String defaultVal, String classAnnotation) {
		setDefault(defaultVal);
		setContexts(contexts);
		setClassAnnotation(classAnnotation);
	}

	public List<String> getContexts() {
		return contexts;
	}

	public void setContexts(List<String> contexts) {
		this.contexts = contexts;
	}

	public String getDefault() {
		return defaultValue;
	}

	public void setDefault(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getClassAnnotation() {
		return classAnnotation;
	}

	public void setClassAnnotation(String classAnnotation) {
		this.classAnnotation = classAnnotation;
	}

	protected String updateComment(int level, String s) {
		String comment = getComment();
		if (comment != null && !comment.isEmpty()) {
			String pre = NginxHelper.getSpace(level);
			s = String.format(COMMENT_PRINT_FORMAT, pre, comment, s);
		}
		return s;
	}

	public abstract String getComment();
}
