/*-------------------------------------------------------------------------------------------------------------------*\
|  Copyright (C) 2014 eBay Software Foundation                                                                        |
|                                                                                                                     |
|  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance     |
|  with the License.                                                                                                  |
|                                                                                                                     |
|  You may obtain a copy of the License at                                                                            |
|                                                                                                                     |
|       http://www.apache.org/licenses/LICENSE-2.0                                                                    |
|                                                                                                                     |
|  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed   |
|  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for  |
|  the specific language governing permissions and limitations under the License.                                     |
\*-------------------------------------------------------------------------------------------------------------------*/

package com.paypal.selion.ios.sample;

import com.paypal.selion.annotations.MobileTest;
import com.paypal.selion.platform.grid.Grid;
import com.paypal.selion.reports.runtime.MobileReporter;

import org.testng.annotations.Test;

public class IOSTest {
    @MobileTest(appName = "Safari")
    @Test
    public void mobileTest() {
        Grid.open("http://www.paypal.com");
        MobileReporter.log("screenshot", true);
    }

    @MobileTest(appName = "Safari", device = "ipad")
    @Test
    public void testIOSDefaultsIpad() {
        Grid.open("http://www.paypal.com");
        MobileReporter.log("My Screenshot 1", true);
    }

    @MobileTest(appName = "Safari", device = "ipad", deviceType = "iPadAir")
    @Test
    public void testIOSDefaultsIpadAir() {
        Grid.open("http://www.paypal.com");
        MobileReporter.log("My Screenshot 1", true);
    }
}