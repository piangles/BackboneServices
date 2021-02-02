/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
 
package org.piangles.backbone.services.geo;

import java.io.Serializable;

public final class PhysicalAddress implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String city;
	private String state; ///Could  be full name or code need to standardize it
	private ZipCode zipCode; //12345 and 12345-6789 for USA need to think for Canada
	private String country;
	
	public PhysicalAddress(String addressLine1, String addressLine2, String city, String state, ZipCode zipCode, String country)
	{
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
	}

	public PhysicalAddress(String addressLine1, String addressLine2, String addressLine3, String city, String state, ZipCode zipCode, String country)
	{
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
	}

	public PhysicalAddress setAddressLine1(String addressLine1)
	{
		this.addressLine1 = addressLine1;
		return this;
	}
	
	public PhysicalAddress setAddressLine2(String addressLine2)
	{
		this.addressLine2 = addressLine2;
		return this;
	}

	public PhysicalAddress setAddressLine3(String addressLine3)
	{
		this.addressLine3 = addressLine3;
		return this;
	}

	public PhysicalAddress setCity(String city)
	{
		this.city = city;
		return this;
	}

	public PhysicalAddress setState(String state)
	{
		this.state = state;
		return this;
	}

	public PhysicalAddress setZipCode(ZipCode zipCode)
	{
		this.zipCode = zipCode;
		return this;
	}

	public PhysicalAddress setCountry(String country)
	{
		this.country = country;
		return this;
	}

	public String getAddressLine1()
	{
		return addressLine1;
	}

	public String getAddressLine2()
	{
		return addressLine2;
	}

	public String getAddressLine3()
	{
		return addressLine3;
	}

	public String getCity()
	{
		return city;
	}

	public String getState()
	{
		return state;
	}

	public ZipCode getZipCode()
	{
		return zipCode;
	}

	public String getCountry()
	{
		return country;
	}
	
	public boolean isValid()
	{
		return false;
	}
}
