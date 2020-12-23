# webService
java 调取 wsdl 接口例子
示例wsdl
<wsdl:definitions xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="https://webservice.haeco.com/" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:ns1="http://schemas.xmlsoap.org/soap/http" name="LogisticsInfoServiceImplService" targetNamespace="https://webservice.haeco.com/">
<wsdl:types>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:tns="https://webservice.haeco.com/" elementFormDefault="unqualified" targetNamespace="https://webservice.haeco.com/" version="1.0">
<xs:element name="getAWB" type="tns:getAWB"/>
<xs:element name="getAWBResponse" type="tns:getAWBResponse"/>
<xs:complexType name="getAWB">
<xs:sequence>
<xs:element form="qualified" minOccurs="0" name="companyCode" type="xs:string"/>
<xs:element form="qualified" minOccurs="0" name="Data" type="xs:string"/>
</xs:sequence>
</xs:complexType>
<xs:complexType name="getAWBResponse">
<xs:sequence>
<xs:element minOccurs="0" name="return" type="xs:string"/>
</xs:sequence>
</xs:complexType>
</xs:schema>
</wsdl:types>
<wsdl:message name="getAWB">
<wsdl:part element="tns:getAWB" name="parameters"> </wsdl:part>
</wsdl:message>
<wsdl:message name="getAWBResponse">
<wsdl:part element="tns:getAWBResponse" name="parameters"> </wsdl:part>
</wsdl:message>
<wsdl:portType name="LogisticsInfoService">
<wsdl:operation name="getAWB">
<wsdl:input message="tns:getAWB" name="getAWB"> </wsdl:input>
<wsdl:output message="tns:getAWBResponse" name="getAWBResponse"> </wsdl:output>
</wsdl:operation>
</wsdl:portType>
<wsdl:binding name="LogisticsInfoServiceImplServiceSoapBinding" type="tns:LogisticsInfoService">
<soap12:binding style="document" transport="http://schemas.xmlsoap.org/soap/http"/>
<wsdl:operation name="getAWB">
<soap12:operation soapAction="https://webservice.haeco.com/getAWB" style="document"/>
<wsdl:input name="getAWB">
<soap12:body use="literal"/>
</wsdl:input>
<wsdl:output name="getAWBResponse">
<soap12:body use="literal"/>
</wsdl:output>
</wsdl:operation>
</wsdl:binding>
<wsdl:service name="LogisticsInfoServiceImplService">
<wsdl:port binding="tns:LogisticsInfoServiceImplServiceSoapBinding" name="logisticsInfoServiceImplPort">
<soap12:address location="http://localhost:8882/services/logisticsInfoService"/>
</wsdl:port>
</wsdl:service>
</wsdl:definitions>
往companyCode及Data中写入相关数据

