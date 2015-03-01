package com.hookheart.bookbook.utils;

/* 
 * @(#)XMLSax.java             Project:bookscan 
 * Date:2012-12-3 
 * 
 * Copyright (c) 2011 CFuture09, Institute of Software,  
 * Guangdong Ocean University, Zhanjiang, GuangDong, China. 
 * All rights reserved. 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *  you may not use this file except in compliance with the License. 
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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;


import android.util.Log;
import android.util.Xml;

import com.hookheart.bookbook.bean.Book;

/**
 * @author Geek_Soledad (66704238@51uc.com)
 */
public class IsbnXmlSax {

	public static Book sax(InputStream is) {
		Book book = null;
		XmlPullParser parser = Xml.newPullParser();
		/*
		 * int i = -1; //org.apache.commons.io.output.ByteArrayOutputStream
		 * ByteArrayOutputStream baos = new ByteArrayOutputStream(); try { while
		 * ((i = is.read()) != -1) { baos.write(i); } } catch (IOException e1) {
		 * // TODO Auto-generated catch block e1.printStackTrace(); } String
		 * content = baos.toString(); Log.d("tt", content);
		 */
		try {
			parser.setInput(is, "UTF-8");
			int eventType = parser.getEventType();
			while (eventType != XmlPullParser.END_DOCUMENT) {
				switch (eventType) {
				case XmlPullParser.START_TAG:
					Log.d("test", parser.getName());

					if (parser.getName().equals("entry")) {
						book = new Book();
					} else if (parser.getName().equals("link")) {
						if (parser.getAttributeValue(null, "rel").equals(
								"image")) {
							book.setImageurl(parser
									.getAttributeValue(null, "href"));
						}
						eventType = parser.next();
					} else if (parser.getName().equals("attribute")) {
						String attribute = parser.getAttributeValue(0);
						eventType = parser.next();
						if (attribute.equals("title")) {
							book.setName(parser.getText());
							Log.d("TESTTEST", parser.getText());
						} else if (attribute.equals("author")) {
							book.setAuthor(parser.getText());
						} else if (attribute.equals("isbn10")) {
							book.setIsbn10(parser.getText());
						} else if (attribute.equals("isbn13")) {
							book.setIsbn13(parser.getText());
						} else if (attribute.equals("publisher")) {
							book.setPublisher(parser.getText());
						}
					} else if (parser.getName().equals("summary")) {
						eventType = parser.next();
						book.setSummary(parser.getText());
					} else if (parser.getName().equals("title")) {
						if (book != null && book.getName() == null) {
							Log.d("TESTTEST", parser.getName());
							eventType = parser.next();
							book.setName(parser.getText());
						}
					}
					break;
				case XmlPullParser.END_TAG:
					break;
				}
				eventType = parser.next();
			}

		} catch (XmlPullParserException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return book;
	}
}