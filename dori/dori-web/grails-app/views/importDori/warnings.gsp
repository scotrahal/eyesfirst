<!DOCTYPE html>
<%--
Copyright 2013 The MITRE Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
--%>
<html>
 <head>
  <title>Import Scans</title>
  <dori:favicon/>
 </head>
 <body>
  <h1>Warnings Importing Scan</h1>
  <p>The scan you attempted to upload contained the following warnings:</p>
  <ul>
  <g:each in="${warnings}" var="warning">
   <li>${warning}</li>
  </g:each>
  </ul>
  <p>You may choose to ignore these warnings and upload the data anyway.</p>
  <g:uploadForm controller="importDori" action="upload" >
   <p>Import from: <input type="file" name="importedFile"></p>
   <p><input type="checkbox" name="ignoreWarnings" value="yes"> Ignore all warnings</p>
   <p><input type="submit" value="Import">
  </g:uploadForm>
 </body>
</html>