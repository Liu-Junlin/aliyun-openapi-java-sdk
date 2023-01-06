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

package com.aliyuncs.ims.transform.v20190815;

import com.aliyuncs.ims.model.v20190815.GetOIDCProviderResponse;
import com.aliyuncs.ims.model.v20190815.GetOIDCProviderResponse.OIDCProvider;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOIDCProviderResponseUnmarshaller {

	public static GetOIDCProviderResponse unmarshall(GetOIDCProviderResponse getOIDCProviderResponse, UnmarshallerContext _ctx) {
		
		getOIDCProviderResponse.setRequestId(_ctx.stringValue("GetOIDCProviderResponse.RequestId"));

		OIDCProvider oIDCProvider = new OIDCProvider();
		oIDCProvider.setUpdateDate(_ctx.stringValue("GetOIDCProviderResponse.OIDCProvider.UpdateDate"));
		oIDCProvider.setDescription(_ctx.stringValue("GetOIDCProviderResponse.OIDCProvider.Description"));
		oIDCProvider.setOIDCProviderName(_ctx.stringValue("GetOIDCProviderResponse.OIDCProvider.OIDCProviderName"));
		oIDCProvider.setCreateDate(_ctx.stringValue("GetOIDCProviderResponse.OIDCProvider.CreateDate"));
		oIDCProvider.setArn(_ctx.stringValue("GetOIDCProviderResponse.OIDCProvider.Arn"));
		oIDCProvider.setIssuerUrl(_ctx.stringValue("GetOIDCProviderResponse.OIDCProvider.IssuerUrl"));
		oIDCProvider.setFingerprints(_ctx.stringValue("GetOIDCProviderResponse.OIDCProvider.Fingerprints"));
		oIDCProvider.setClientIds(_ctx.stringValue("GetOIDCProviderResponse.OIDCProvider.ClientIds"));
		oIDCProvider.setGmtCreate(_ctx.stringValue("GetOIDCProviderResponse.OIDCProvider.GmtCreate"));
		oIDCProvider.setGmtModified(_ctx.stringValue("GetOIDCProviderResponse.OIDCProvider.GmtModified"));
		getOIDCProviderResponse.setOIDCProvider(oIDCProvider);
	 
	 	return getOIDCProviderResponse;
	}
}