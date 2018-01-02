package com.wepay.nginx;

import static com.wepay.nginx.Constants.NEWLINE;
import static com.wepay.nginx.Constants.SPACE;

import java.util.ArrayList;
import java.util.Iterator;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wepay.nginx.exceptions.InvalidConditionDirectiveException;
import com.wepay.nginx.helper.NginxHelper;

public class ListDumps<T> extends ArrayList<T> implements Dumps {
	@Override
	public String dump(int level) throws Exception {
		StringBuilder sb = new StringBuilder();
		String pre = NginxHelper.getSpace(level);
		Iterator it = this.iterator();
		int i = 0;
		while (it.hasNext()) {
			Dumps dp = (Dumps) it.next();
			sb.append( dp.dump(level));
		}
		return sb.toString();
	}
}
