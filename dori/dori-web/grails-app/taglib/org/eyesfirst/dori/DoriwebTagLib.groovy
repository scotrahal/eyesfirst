/*
 * Copyright 2012 The MITRE Corporation
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
package org.eyesfirst.dori

class DoriwebTagLib {
	static namespace = 'dori'

	/**
	 * Render our favicon.
	 */
	def favicon = {
		out << "<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"";
		out << g.resource(dir: 'images', file: 'favicon.ico')
		out << "\" />";
	}

	/**
	 * @attr type the type of icon to render (true, false, or null)
	 */
	def feedbackIcon = { attrs ->
		def type = attrs.type;
		if (type == null) {
			type = "feedback";
		}
		type = type.encodeAsHTML();
		out << "<span class=\"" << type << " " << type << "-" << (attrs.value == null ? "none" : (attrs.value ? "yes" : "no")) << "\">"
		if (attrs.value != null) {
			out << (attrs.value ? "Yes" : "No");
		}
		out << "</span>"
	}
}
