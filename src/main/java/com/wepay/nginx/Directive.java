package com.wepay.nginx;

import static com.wepay.nginx.Constants.*;

import java.text.MessageFormat;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wepay.nginx.exceptions.InvalidConditionDirectiveException;
import com.wepay.nginx.helper.NginxHelper;

public abstract class Directive extends NginxAbstractClass {

	public Directive(List contexts, String defaultVal, String classAnnotation) {
		super(contexts, defaultVal, classAnnotation);
	}

	@JsonProperty("name")
	protected String name;

	@JsonProperty("value")
	protected String value;

	@JsonProperty("condition_start")
	protected String conditionStart;

	@JsonProperty("condition_end")
	protected String conditionEnd;

	@JsonProperty("comment")
	protected String comment;
	private int formatLength;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getFormatLength() {
		if(formatLength==0){
			formatLength=getClassAnnotation()==null?1:getClassAnnotation().length();
		}
		return formatLength;
	}

	public void setFormatLength(int formatLength) {
		this.formatLength = formatLength;
	}

	public String updateConditionBlock(int level, String str) throws InvalidConditionDirectiveException {
		String s = str;
		if (conditionStart != null && !conditionStart.trim().isEmpty()) {
			if (conditionEnd == null || conditionEnd.trim().isEmpty()) {
				throw new InvalidConditionDirectiveException();
			} else {
				String pre = NginxHelper.getSpace(level);
				s = String.format(CONTEXT_PRINT_FORMAT_CONDITION, pre, conditionStart, str, pre, conditionEnd);
			}
		}
		return updateComment(level, s);
	}

	public String dump(int level, String ctx) throws InvalidConditionDirectiveException {
		String value = getValue() == null ? getDefault() : getValue();
		String pre = NginxHelper.getSpace(level);
		if (value == null) {
			return "";
		}
		String format=MessageFormat.format(DIRECTIVE_PRINT_FORMAT,getFormatLength());
		String s = String.format(format, pre, getClassAnnotation(), getValue());
		return updateConditionBlock(level, s);
	}

	
	@Override
	public String getComment() {
		return comment;
	}

}
