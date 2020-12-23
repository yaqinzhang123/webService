package com;


import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;


/**
 * 测试
 * @date
 */
public class Test {
	
	private static final String webServiceNameSpace = "https://webservice.haeco.com/";
	private static final String endpointAddress = "http://localhost:8882/services/logisticsInfoService?wsdl";


	public static void main(String[] args) {
		String companyCode = "000";//货代编码
		//示例base64加密串
		//ICB7CiAic2hpcHBpbmdNZXRob2QiOiJBSVIiLAogIm9yaWdpblBvcnQiOiJYTU4iLAogICJkZXN0aW5hdGlvblBvcnQiOiAiTlJUIiwgCiAgIkFXQiI6IlgxIiwgCiAgInNlcnZpY2VUeXBlIjoiWFhYIiwgCiAgImZvcndhcmRlck5hbWUiOiJYWFhYWCIsIAogICJmb3J3YXJkZXJDb2RlIjoiMTk0NTgyIiwKICAiZmxpZ2h0Tm8iOiJOSDg1MTYiLCAKICAicGllY2VzIjoiNTAiLCAKICAiZ3Jvc3NXZWlnaHQgIjoiMzAwIiwgCiAgInRvdGFsVm9sdW1lIjoiMjAwIiwgCiAgImNoYXJnZWFibGVXZWlnaHQgIjoiMzIwIiwgICAgCiAgImlmT3ZlcnNpemUiOiJUcnVlIiwKICAib3ZlcnNpemVEaW1lbnNpb24iOiIxNSwyMCIsCiAgImNyZWF0ZVRpbWUiOiIyMDIwLTExLTA2IDA4OjAwOjAwIiwgCiAgInN0YXR1cyI6IkFDVElWRSIsICAgIAogICJ3YXliaWxsTGluZXMiOlsgCiAgICAgIHsKICAgICAgICAgICJvcmRlck5vIjoiMTIzIiwgCiAgICAgICAgICAic2VydmljZVR5cGUiOiJBT0ciLCAgIAogICAgICAgICAgInBpY2tVcFRpbWUiOiIyMDIwLTExLTA2IDA4OjAwOjAwIiwgCiAgICAgICAgICAic3VwcGxpZXJOYW1lIjoiWFhYWFgiLCAgIAogICAgICAgICAgIlBJRCI6IjEyIiwgICAgIAogICAgICAgICAgIm93bmVyIjoiWFhYWCIgICAgIAogICAgICB9LAogICAgICAgewogICAgICAgICAgIm9yZGVyTm8iOiI0NTYiLCAKICAgICAgICAgICJzZXJ2aWNlVHlwZSI6IkFPRyIsICAgCiAgICAgICAgICAicGlja1VwVGltZSI6IjIwMjAtMTEtMDYgMDg6MDA6MDAiLCAKICAgICAgICAgICJzdXBwbGllck5hbWUiOiJYWFhYWCIsICAgCiAgICAgICAgICAiUElEIjoiMTIiLCAgICAgCiAgICAgICAgICAib3duZXIiOiJYWFhYIiAgICAgCiAgICAgIH0KICBdCn0=
		//转换之后的串
		//ZXRob2QiOiJBSVIiLAogIm9yaWdpblBvcnQiOiJYTU4iLAogICJkZXN0aW5hdGlvblBvcnQiOiAiTlJUIiwgCiAgIkFXQiI6IlgxIiwgCiAgInNlcnZpY2VUeXBlIjoiWFhYIiwgCiAgImZvcndhcmRlck5hbWUiOiJYWFhYWCIsIAogICJmb3J3YXJkZXJDb2RlIjoiMTk0NTgyIiwKICAiZmxpZ2h0Tm8iOiJOSDg1MTYiLCAKICAicGllY2VzIjoiNTAiLCAKICAiZ3Jvc3NXZWlnaHQgIjoiMzAwIiwgCiAgInRvdGFsVm9sdW1lIjoiMjAwIiwgCiAgImNoYXJnZWFibGVXZWlnaHQgIjoiMzIwIiwgICAgCiAgImlmT3ZlcnNpemUiOiJUcnVlIiwKICAib3ZlcnNpemVEaW1lbnNpb24iOiIxNSwyMCIsCiAgImNyZWF0ZVRpbWUiOiIyMDIwLTExLTA2IDA4OjAwOjAwIiwgCiAgInN0YXR1cyI6IkFDVElWRSIsICAgIAogICJ3YXliaWxsTGluZXMiOlsgCiAgICAgIHsKICAgICAgICAgICJvcmRlck5vIjoiMTIzIiwgCiAgICAgICAgICAic2VydmljZVR5cGUiOiJBT0ciLCAgIAogICAgICAgICAgInBpY2tVcFRpbWUiOiIyMDIwLTExLTA2IDA4OjAwOjAwIiwgCiAgICAgICAgICAic3VwcGxpZXJOYW1lIjoiWFhYWFgiLCAgIAogICAgICAgICAgIlBJRCI6IjEyIiwgICAgIAogICAgICAgICAgIm93bmVyIjoiWFhYWCIgICAgIAogICAgICB9LAogICAgICAgewogICAgICAgICAgIm9yZGVyTm8iOiI0NTYiLCAKICAgICAgICAgICJzZXJ2aWNlVHlwZSI6IkFPRyIsICAgCiAgICAgICAgICAicGlja1VwVGltZSI6IjIwMjAtMTEtMDYgMDg6MDA6MDAiLCAKICAgICAgICAgICJzdXBwbGllck5hbWUiOiJYWFhYWCIsICAgCiAgICAgICAgICAiUElEIjoiMTIiLCAgICAgCiAgICAgICAgICAib3duZXIiOiJYWFhYIiAgICAgCiAgICAgIH0KICBdCn0=ICB7CiAic2hpcHBpbmdN
		String data = "ZXRob2QiOiJBSVIiLAogIm9yaWdpblBvcnQiOiJYTU4iLAogICJkZXN0aW5hdGlvblBvcnQiOiAiTlJUIiwgCiAgIkFXQiI6IlgxIiwgCiAgInNlcnZpY2VUeXBlIjoiWFhYIiwgCiAgImZvcndhcmRlck5hbWUiOiJYWFhYWCIsIAogICJmb3J3YXJkZXJDb2RlIjoiMTk0NTgyIiwKICAiZmxpZ2h0Tm8iOiJOSDg1MTYiLCAKICAicGllY2VzIjoiNTAiLCAKICAiZ3Jvc3NXZWlnaHQgIjoiMzAwIiwgCiAgInRvdGFsVm9sdW1lIjoiMjAwIiwgCiAgImNoYXJnZWFibGVXZWlnaHQgIjoiMzIwIiwgICAgCiAgImlmT3ZlcnNpemUiOiJUcnVlIiwKICAib3ZlcnNpemVEaW1lbnNpb24iOiIxNSwyMCIsCiAgImNyZWF0ZVRpbWUiOiIyMDIwLTExLTA2IDA4OjAwOjAwIiwgCiAgInN0YXR1cyI6IkFDVElWRSIsICAgIAogICJ3YXliaWxsTGluZXMiOlsgCiAgICAgIHsKICAgICAgICAgICJvcmRlck5vIjoiMTIzIiwgCiAgICAgICAgICAic2VydmljZVR5cGUiOiJBT0ciLCAgIAogICAgICAgICAgInBpY2tVcFRpbWUiOiIyMDIwLTExLTA2IDA4OjAwOjAwIiwgCiAgICAgICAgICAic3VwcGxpZXJOYW1lIjoiWFhYWFgiLCAgIAogICAgICAgICAgIlBJRCI6IjEyIiwgICAgIAogICAgICAgICAgIm93bmVyIjoiWFhYWCIgICAgIAogICAgICB9LAogICAgICAgewogICAgICAgICAgIm9yZGVyTm8iOiI0NTYiLCAKICAgICAgICAgICJzZXJ2aWNlVHlwZSI6IkFPRyIsICAgCiAgICAgICAgICAicGlja1VwVGltZSI6IjIwMjAtMTEtMDYgMDg6MDA6MDAiLCAKICAgICAgICAgICJzdXBwbGllck5hbWUiOiJYWFhYWCIsICAgCiAgICAgICAgICAiUElEIjoiMTIiLCAgICAgCiAgICAgICAgICAib3duZXIiOiJYWFhYIiAgICAgCiAgICAgIH0KICBdCn0=ICB7CiAic2hpcHBpbmdN";
		String result = getAWB(companyCode,data);
		System.out.println(result);
	}
	
	/**
	 * 调用平台webservice登录方法
	 * @return
	 */
	public static String getAWB(String companyCode,String data) {
		String result = "";
		try {
			Service service = new Service();
			Call call = (Call) service.createCall();

			call.setSOAPActionURI(webServiceNameSpace + "getAWB");
			call.setTargetEndpointAddress(endpointAddress);
			call.setOperationName(new QName(webServiceNameSpace, "getAWB"));
			call.addParameter("companyCode",org.apache.axis.encoding.XMLType.XSD_STRING,
					javax.xml.rpc.ParameterMode.IN);
			call.addParameter("Data",org.apache.axis.encoding.XMLType.XSD_STRING,
					javax.xml.rpc.ParameterMode.IN);
			call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);// 设置返回类型
			result = (String) call.invoke(new Object[] {companyCode,data});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
