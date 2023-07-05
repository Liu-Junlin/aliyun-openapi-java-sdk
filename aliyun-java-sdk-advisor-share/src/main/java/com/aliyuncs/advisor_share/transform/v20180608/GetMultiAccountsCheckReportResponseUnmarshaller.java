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

package com.aliyuncs.advisor_share.transform.v20180608;

import com.aliyuncs.advisor_share.model.v20180608.GetMultiAccountsCheckReportResponse;
import com.aliyuncs.advisor_share.model.v20180608.GetMultiAccountsCheckReportResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMultiAccountsCheckReportResponseUnmarshaller {

	public static GetMultiAccountsCheckReportResponse unmarshall(GetMultiAccountsCheckReportResponse getMultiAccountsCheckReportResponse, UnmarshallerContext _ctx) {
		
		getMultiAccountsCheckReportResponse.setRequestId(_ctx.stringValue("GetMultiAccountsCheckReportResponse.RequestId"));

		Data data = new Data();
		data.setReportExist(_ctx.booleanValue("GetMultiAccountsCheckReportResponse.Data.ReportExist"));
		data.setExcelReportUrl(_ctx.stringValue("GetMultiAccountsCheckReportResponse.Data.ExcelReportUrl"));
		data.setReportGenerateTime(_ctx.stringValue("GetMultiAccountsCheckReportResponse.Data.ReportGenerateTime"));
		data.setPdfReportUrl(_ctx.stringValue("GetMultiAccountsCheckReportResponse.Data.PdfReportUrl"));
		getMultiAccountsCheckReportResponse.setData(data);
	 
	 	return getMultiAccountsCheckReportResponse;
	}
}