package com.wepay.nginx;

public class Constants {
	public static final String OFF = "off";
	public static final String VALUE_STR = "value";
	public static final String NEWLINE = "\n";
	public static String HTTP = "http";
	public static String SERVER = "server";
	public static String LOCATION = "location";
	public static String EVENTS ="events";
	public static String MAIN = "main";
	public static String IF = "if";
	public static String MAIL = "mail";
	public static String UPSTREAM ="upstream";
	public static String STREAM = "stream";
	public static String GEO = "geo";
	public static String IF_IN_LOCATION ="if_in_location";
	public static final String ANY="any";
	public static final String LIMIT_EXCEPT="limit_except";
	public static String TAB="\t";
	public static int TAB_COUNT=2;
	public static String LCB = "{";
	public static String RCB = "}";
	public static int SPACE_COUNT=2;
	public static String SPACE=" ";
	public static final int BASIC_LEVEL = 0;
	public static final String SEMICOLON = ";";
	public static final String TAB_SPACE = "%s";
	public static final String COMMENT_PRINT_FORMAT=TAB_SPACE+"#%s"+NEWLINE+"%s";
	public static final String DIRECTIVE_PRINT_FORMAT = TAB_SPACE+"%-{0}s %s" + SEMICOLON + NEWLINE;//ex: "     dir_name      /etc/nginx/*;"
	public static final String DIRECTIVE_IP_PRINT_FORMAT = TAB_SPACE+"%s" + SEMICOLON + NEWLINE;//ex: "     dir_name      /etc/nginx/*;"
	public static final String DIRECTIVE_PRINT_FORMAT_CONDITION = TAB_SPACE+"%s" + NEWLINE + DIRECTIVE_PRINT_FORMAT+TAB_SPACE+"%s"+ NEWLINE;
	public static final String TEST_RESOURCE_PATH="src/test/java/com/wepay/nginx/resources";
	public static final String CONTEXT_PRINT_FORMAT = TAB_SPACE+"%s {" + NEWLINE + "%s" + TAB_SPACE+"}" + NEWLINE;
	public static final String CONTEXT_PRINT_FORMAT_CONDITION = "%s%s" + NEWLINE + "%s" + "%s%s" + NEWLINE;
	public static final String NAMED_CONTEXT_PRINT_FORMAT=TAB_SPACE + "%s" + SPACE + "%s {" + NEWLINE + "%s"  + TAB_SPACE+"}" + NEWLINE;
}

 