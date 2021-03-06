/*
 * Copyright 2015 Open mHealth
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openmhealth.shim.ihealth.mapper;

import org.openmhealth.schema.domain.omh.HeartRate;


/**
 * A mapper that translates responses from the iHealth <code>/bp.json</code> endpoint into {@link HeartRate} measures.
 *
 * @author Emerson Farrugia
 * @author Chris Schaefbauer
 * @see <a href="http://developer.ihealthlabs.com/dev_documentation_RequestfordataofBloodPressure.htm">endpoint
 * documentation</a>
 */
public class IHealthBloodPressureEndpointHeartRateDataPointMapper extends IHealthHeartRateDataPointMapper {

    @Override
    protected String getListNodeName() {
        return "BPDataList";
    }
}
