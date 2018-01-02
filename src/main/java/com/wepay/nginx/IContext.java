package com.wepay.nginx;

import java.util.List;

public interface IContext {
	public List<String> getContexts(); 
	public void setContexts(List<String> contexts);
}
