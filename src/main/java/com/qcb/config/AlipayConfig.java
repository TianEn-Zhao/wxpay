package com.qcb.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
	
	//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

		// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
		public static String app_id = "2016092400582266";
		
		// 商户私钥，您的PKCS8格式RSA2私钥
	    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCxBPnCsdzNrUwp\r\n" + 
	    		"L3RXw4Y6sYhKRme1yr6cV3x7juEoV+9xUnnyb5W8qARM+pnfst1lulj5QCXR4b/+\r\n" + 
	    		"HWU9ILJhLcWfQKsmue8iVY66KHRjUyY2sc0pq0SP+j5Ef/pEb2Z5Sj/0GIkLJHJT\r\n" + 
	    		"bQFQUbBWdCnWSTAxCwkWF8iOXJTDqEbVxUZy5wwi2z4I9faJyeLCL6uWzCLeLJRe\r\n" + 
	    		"DLcrfPEmE0aTdiZk98GjvIZvZ8qWsiJr2bjNs1wu+9iXnINcjWbHc+r60gq+WmNg\r\n" + 
	    		"96EAa0oZWvuxbyMTb+t2AAiRTeghZJmmtmv2g5ivTKAGjwn5oc1Lo+7GLIXoQiMc\r\n" + 
	    		"VaZvNvTJAgMBAAECggEASzPz73Ske3R+AJk6cfaM1e6KGhPjB2ZEqCK6rbs7iGoj\r\n" + 
	    		"PR9u00H4eRdgDFwCdviD+i26ktlft9SSPiC628dCQOqzJD7S9zbSkuGKKyf4miG/\r\n" + 
	    		"AEl1AZjTHd+QCIXeCqjQ/gI/PTIXNnabYznR7w9lPLVI+NJK+OrZR1t/RouqX5wu\r\n" + 
	    		"lA+v3sFpE+fVnKttdUGM0MGnG0JKEcmnt2e0xtMQg80bOPz9OT6IQSW8YWkMQqJK\r\n" + 
	    		"nSzLOYisqxhX4v2MI1RWiEQgkg4JcVBiraoVk+8V6KzAN8zy6yz52y2sb8evIpg4\r\n" + 
	    		"d9Ch8WoBSY98wj1EXzMnUDX7wedrE0P1CMLSpPUOKQKBgQDiXMmsX5Dh3D0reEXX\r\n" + 
	    		"qk4jbPPg60camgoorKBKTJkQZ32rQsGfoF/ppmB80Dma8bNP91EM6DMu/zG+dYGq\r\n" + 
	    		"ABvtY/27hABWUaOmlhkThfE8UxnbVeGxkDID9/eAEl74t3hGEW9D1kgB3GRjEB44\r\n" + 
	    		"xtNbPyESSNgg3cLdG7sYM7y3dwKBgQDIMk9BmYNLYhny0f9zn7MLPe4GGK9oZ9lv\r\n" + 
	    		"99LjymMoWFxZz6Cgh4rUHMmIbNXT4khQOc2lkUccsYSZZQLScEf4auKMBEirxOlP\r\n" + 
	    		"AbyOtdmuOZGb5KKog7PYTRpuAGmfFf/dYAx1sTv8vgvfv7aeN/EDVOYN8J70fbdX\r\n" + 
	    		"GRTZ44FFvwKBgAVP7COxcnL6ei0E+46eHotSST7kBp0nNEnUE0brGUR7SUW1oVmf\r\n" + 
	    		"p+CR2P3U3SU3ut+LjEljQaA+uOohU9OrgPxHNnMqG9/qto54Q0pkAE9MG/U7xLoo\r\n" + 
	    		"CiRxs0s8IyJvG9F5I0VSSApTI7/3Zt4qPFeN2bbWIsxSp/oMZo2g2TLtAoGAJnlc\r\n" + 
	    		"t/u7utoQqJTpJhxz+V4eh3dpBoSmyhjzo6l6ov9QSEZZ1WAXMyqRJLHd6kmboidp\r\n" + 
	    		"uT8RTpdjJ2O9RhokCr7n6QbNvI0sVW29AiQ6wHv52t72z7H390LiKG/V3KgKs03J\r\n" + 
	    		"NzknkSwo9ghPHVsc64n+aIFs2wnqGUgNtM4/QtsCgYAx3GEqKF2sWtku/c3P4k+H\r\n" + 
	    		"ipuZpKn3pffLQrtcl3wDx2/iEapaKMpTJT9giRt19sdRDXLKCxv+ToY/G2kRg8lJ\r\n" + 
	    		"INqU+5Cm0x5XSgo3lzrRjeeeYmABf439qP7qU/MW2EstK5xOSPgULtZJ1dloD6lh\r\n" + 
	    		"ixsf+5uhriZq30AWT1UTaA==";
		
		// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
	    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtk1ggapsg03NPApUz6oYmzN9kKfjUIAYVgofIm/zqOU2JZI/46GdMz0j2uOh0w7UiH9ewwRtjQVtGInkww/EYcILvqcev/rCSSypj7LTd1+A24npuaP9W6yeg7jKu9LyrlcbsmGn9F4SSiO4T5CPUO5ixvdCaVHImkgPTuqoYbLNXyjHpupNQ0MhlMexjD5sc+LefPzdoernFWokM+VUrzQzQkM68UCzfdfgCeqMkBA9jI4vBc/MDnwrqGF1r6xoo/pJrNaZmRBRaD77Q3ShEVE7uorIXSKVzwVri6Zrsf9VVRQiDK5verPEoE+FFb8Ry2Ex0FZo8S7Xe6YPBNoWMQIDAQAB";

		// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
		public static String notify_url = "http://www.baidu.com";

		// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
		public static String return_url = "http://www.baidu.com";

		// 签名方式
		public static String sign_type = "RSA2";

		// 字符编码格式
		public static String charset = "utf-8";
		
		// 支付宝网关
		public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
		
		// 支付宝网关
		public static String log_path = "C:\\";


	//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

	    /** 
	     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
	     * @param sWord 要写入日志里的文本内容
	     */
	    public static void logResult(String sWord) {
	        FileWriter writer = null;
	        try {
	            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
	            writer.write(sWord);
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (writer != null) {
	                try {
	                    writer.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }
	}


