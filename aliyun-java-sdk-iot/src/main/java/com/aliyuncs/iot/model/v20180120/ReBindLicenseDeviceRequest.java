/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReBindLicenseDeviceRequest extends RpcAcsRequest<ReBindLicenseDeviceResponse> {
	   

	private List<String> deviceNameLists;

	private String iotInstanceId;

	private String productKey;

	private String licenseCode;
	public ReBindLicenseDeviceRequest() {
		super("Iot", "2018-01-20", "ReBindLicenseDevice");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getDeviceNameLists() {
		return this.deviceNameLists;
	}

	public void setDeviceNameLists(List<String> deviceNameLists) {
		this.deviceNameLists = deviceNameLists;	
		if (deviceNameLists != null) {
			for (int i = 0; i < deviceNameLists.size(); i++) {
				putBodyParameter("DeviceNameList." + (i + 1) , deviceNameLists.get(i));
			}
		}	
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public String getLicenseCode() {
		return this.licenseCode;
	}

	public void setLicenseCode(String licenseCode) {
		this.licenseCode = licenseCode;
		if(licenseCode != null){
			putQueryParameter("LicenseCode", licenseCode);
		}
	}

	@Override
	public Class<ReBindLicenseDeviceResponse> getResponseClass() {
		return ReBindLicenseDeviceResponse.class;
	}

}
