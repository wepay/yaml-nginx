package com.wepay.nginx;

import static com.wepay.nginx.Constants.*;

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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String dump(int level) throws Exception {
		String value = getValue() == null ? getDefault() : getValue();
		String pre = NginxHelper.getSpace(level);
		if (value == null) {
			return "";
		}
		String s = null;
		if (conditionStart != null && !conditionStart.trim().isEmpty()) {
			if (conditionEnd == null || conditionEnd.trim().isEmpty()) {
				throw new InvalidConditionDirectiveException();
			} else {
				s = String.format(DIRECTIVE_PRINT_FORMAT_CONDITION, pre, conditionStart, pre, getClassAnnotation(),
						getValue(), pre, conditionEnd);
			}
		} else {
			s = String.format(DIRECTIVE_PRINT_FORMAT, pre, getClassAnnotation(), getValue());
		}
		return updateComment(level, s);
	}

	@Override
	public String getComment(){
		return comment;
	}

}
