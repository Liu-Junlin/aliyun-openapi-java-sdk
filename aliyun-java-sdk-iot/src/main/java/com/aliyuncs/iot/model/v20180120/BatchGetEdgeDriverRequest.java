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
public class BatchGetEdgeDriverRequest extends RpcAcsRequest<BatchGetEdgeDriverResponse> {
	   

	private List<String> driverIdss;

	private String iotInstanceId;
	public BatchGetEdgeDriverRequest() {
		super("Iot", "2018-01-20", "BatchGetEdgeDriver");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getDriverIdss() {
		return this.driverIdss;
	}

	public void setDriverIdss(List<String> driverIdss) {
		this.driverIdss = driverIdss;	
		if (driverIdss != null) {
			for (int i = 0; i < driverIdss.size(); i++) {
				putQueryParameter("DriverIds." + (i + 1) , driverIdss.get(i));
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

	@Override
	public Class<BatchGetEdgeDriverResponse> getResponseClass() {
		return BatchGetEdgeDriverResponse.class;
	}

}
