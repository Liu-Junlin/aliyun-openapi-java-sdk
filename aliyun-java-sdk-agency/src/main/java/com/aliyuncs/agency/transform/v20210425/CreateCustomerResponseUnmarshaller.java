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

package com.aliyuncs.agency.transform.v20210425;

import com.aliyuncs.agency.model.v20210425.CreateCustomerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCustomerResponseUnmarshaller {

	public static CreateCustomerResponse unmarshall(CreateCustomerResponse createCustomerResponse, UnmarshallerContext _ctx) {
		
		createCustomerResponse.setRequestId(_ctx.stringValue("CreateCustomerResponse.RequestId"));
		createCustomerResponse.setCode(_ctx.stringValue("CreateCustomerResponse.Code"));
		createCustomerResponse.setMessage(_ctx.stringValue("CreateCustomerResponse.Message"));
		createCustomerResponse.setData(_ctx.booleanValue("CreateCustomerResponse.Data"));
		createCustomerResponse.setSuccess(_ctx.booleanValue("CreateCustomerResponse.Success"));
	 
	 	return createCustomerResponse;
	}
}