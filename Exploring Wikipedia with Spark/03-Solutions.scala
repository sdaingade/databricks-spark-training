{"version":"NotebookV1","origId":503877321546993,"name":"03-Solutions","language":"scala","commands":[{"version":"CommandV1","origId":503877321546995,"guid":"c358e033-42c0-4a41-80bc-7ef3f09621f1","subtype":"command","commandType":"auto","position":1.0,"command":"%md ### Solutions to 03_DA-Pageviews RunMe lab","commandVersion":0,"state":"finished","results":null,"errorSummary":null,"error":null,"workflows":[],"startTime":0.0,"submitTime":0.0,"finishTime":0.0,"collapsed":false,"bindings":{},"inputWidgets":{},"displayType":"table","width":"auto","height":"auto","xColumns":null,"yColumns":null,"pivotColumns":null,"pivotAggregation":null,"customPlotOptions":{},"commentThread":[],"commentsVisible":false,"parentHierarchy":[],"diffInserts":[],"diffDeletes":[],"globalVars":{},"latestUser":"","commandTitle":"","showCommandTitle":false,"hideCommandCode":false,"hideCommandResult":false,"iPythonMetadata":null,"streamStates":{},"nuid":"bc1b1528-ff57-454a-bc40-aeea7b5cd03a"},{"version":"CommandV1","origId":503877321546996,"guid":"1336d652-79ea-454a-8548-272f09e5d4bb","subtype":"command","commandType":"auto","position":2.0,"command":"%md **Solutions to Question #1:** How many total incoming requests were to the mobile site vs the desktop site?","commandVersion":0,"state":"finished","results":null,"errorSummary":null,"error":null,"workflows":[],"startTime":0.0,"submitTime":0.0,"finishTime":0.0,"collapsed":false,"bindings":{},"inputWidgets":{},"displayType":"table","width":"auto","height":"auto","xColumns":null,"yColumns":null,"pivotColumns":null,"pivotAggregation":null,"customPlotOptions":{},"commentThread":[],"commentsVisible":false,"parentHierarchy":[],"diffInserts":[],"diffDeletes":[],"globalVars":{},"latestUser":"","commandTitle":"","showCommandTitle":false,"hideCommandCode":false,"hideCommandResult":false,"iPythonMetadata":null,"streamStates":{},"nuid":"798c4a83-b465-4274-bbd5-bc9445b19310"},{"version":"CommandV1","origId":503877321546997,"guid":"fab0f001-3d72-45ab-9913-9d082c83c361","subtype":"command","commandType":"auto","position":3.0,"command":"%md ** Challenge 1:** Using just the commands we learned so far, can you figure out how to filter the DataFrame for just mobile traffic and then sum the requests column?","commandVersion":0,"state":"finished","results":null,"errorSummary":null,"error":null,"workflows":[],"startTime":0.0,"submitTime":0.0,"finishTime":0.0,"collapsed":false,"bindings":{},"inputWidgets":{},"displayType":"table","width":"auto","height":"auto","xColumns":null,"yColumns":null,"pivotColumns":null,"pivotAggregation":null,"customPlotOptions":{},"commentThread":[],"commentsVisible":false,"parentHierarchy":[],"diffInserts":[],"diffDeletes":[],"globalVars":{},"latestUser":"","commandTitle":"","showCommandTitle":false,"hideCommandCode":false,"hideCommandResult":false,"iPythonMetadata":null,"streamStates":{},"nuid":"cf5e04a9-9683-4850-ac34-ffe19f40403e"},{"version":"CommandV1","origId":503877321546998,"guid":"aaa7bcd2-46a4-412e-bfce-ab872de53016","subtype":"command","commandType":"auto","position":4.0,"command":"pageviewsDF.filter(\"site = 'mobile'\").select(sum($\"requests\")).show()","commandVersion":0,"state":"finished","results":null,"errorSummary":null,"error":null,"workflows":[],"startTime":0.0,"submitTime":0.0,"finishTime":0.0,"collapsed":false,"bindings":{},"inputWidgets":{},"displayType":"table","width":"auto","height":"auto","xColumns":null,"yColumns":null,"pivotColumns":null,"pivotAggregation":null,"customPlotOptions":{},"commentThread":[],"commentsVisible":false,"parentHierarchy":[],"diffInserts":[],"diffDeletes":[],"globalVars":{},"latestUser":"","commandTitle":"","showCommandTitle":false,"hideCommandCode":false,"hideCommandResult":false,"iPythonMetadata":null,"streamStates":{},"nuid":"3386d465-f30b-4030-94c6-b0852e47f8f7"},{"version":"CommandV1","origId":503877321546999,"guid":"af9b83cb-5c62-4a71-9c31-9c9c2277273c","subtype":"command","commandType":"auto","position":5.0,"command":"%md ** Challenge 2:** What about the desktop site? How many requests did it get?","commandVersion":0,"state":"finished","results":null,"errorSummary":null,"error":null,"workflows":[],"startTime":0.0,"submitTime":0.0,"finishTime":0.0,"collapsed":false,"bindings":{},"inputWidgets":{},"displayType":"table","width":"auto","height":"auto","xColumns":null,"yColumns":null,"pivotColumns":null,"pivotAggregation":null,"customPlotOptions":{},"commentThread":[],"commentsVisible":false,"parentHierarchy":[],"diffInserts":[],"diffDeletes":[],"globalVars":{},"latestUser":"","commandTitle":"","showCommandTitle":false,"hideCommandCode":false,"hideCommandResult":false,"iPythonMetadata":null,"streamStates":{},"nuid":"9eef0aea-149a-49bf-bf45-be68229ecab4"},{"version":"CommandV1","origId":503877321547000,"guid":"3b0e6744-b7d6-40b5-9db1-fb993952def8","subtype":"command","commandType":"auto","position":6.0,"command":"pageviewsDF.filter($\"site\" === \"desktop\").select(sum($\"requests\")).show()","commandVersion":0,"state":"finished","results":null,"errorSummary":null,"error":null,"workflows":[],"startTime":0.0,"submitTime":0.0,"finishTime":0.0,"collapsed":false,"bindings":{},"inputWidgets":{},"displayType":"table","width":"auto","height":"auto","xColumns":null,"yColumns":null,"pivotColumns":null,"pivotAggregation":null,"customPlotOptions":{},"commentThread":[],"commentsVisible":false,"parentHierarchy":[],"diffInserts":[],"diffDeletes":[],"globalVars":{},"latestUser":"","commandTitle":"","showCommandTitle":false,"hideCommandCode":false,"hideCommandResult":false,"iPythonMetadata":null,"streamStates":{},"nuid":"1e43a69a-9e96-4766-990e-520809749ad0"},{"version":"CommandV1","origId":503877321547001,"guid":"306a8cbf-9905-4eb4-b258-4a9e2f9722f8","subtype":"command","commandType":"auto","position":7.0,"command":"%md **Solutions to Question #2:**  What is the start and end range of time for the pageviews data? How many days of data is in the DataFrame?","commandVersion":0,"state":"finished","results":null,"errorSummary":null,"error":null,"workflows":[],"startTime":0.0,"submitTime":0.0,"finishTime":0.0,"collapsed":false,"bindings":{},"inputWidgets":{},"displayType":"table","width":"auto","height":"auto","xColumns":null,"yColumns":null,"pivotColumns":null,"pivotAggregation":null,"customPlotOptions":{},"commentThread":[],"commentsVisible":false,"parentHierarchy":[],"diffInserts":[],"diffDeletes":[],"globalVars":{},"latestUser":"","commandTitle":"","showCommandTitle":false,"hideCommandCode":false,"hideCommandResult":false,"iPythonMetadata":null,"streamStates":{},"nuid":"cb0538fc-52bf-4b2b-b5b0-edca11eb2a2e"},{"version":"CommandV1","origId":503877321547002,"guid":"9e8a6059-04de-44fb-bcdc-e437ccc2cb3a","subtype":"command","commandType":"auto","position":8.0,"command":"%md ** Challenge 3:** Can you figure out how to check which months of 2015 the data covers (using the [Spark API docs](https://spark.apache.org/docs/latest/api/scala/index.html#org.apache.spark.sql.functions$))?","commandVersion":0,"state":"finished","results":null,"errorSummary":null,"error":null,"workflows":[],"startTime":0.0,"submitTime":0.0,"finishTime":0.0,"collapsed":false,"bindings":{},"inputWidgets":{},"displayType":"table","width":"auto","height":"auto","xColumns":null,"yColumns":null,"pivotColumns":null,"pivotAggregation":null,"customPlotOptions":{},"commentThread":[],"commentsVisible":false,"parentHierarchy":[],"diffInserts":[],"diffDeletes":[],"globalVars":{},"latestUser":"","commandTitle":"","showCommandTitle":false,"hideCommandCode":false,"hideCommandResult":false,"iPythonMetadata":null,"streamStates":{},"nuid":"2aeece14-8ca8-4e92-b196-a867a3a20df0"},{"version":"CommandV1","origId":503877321547003,"guid":"618ff85b-11a8-4c9c-ac10-b1ce8a47c56a","subtype":"command","commandType":"auto","position":9.0,"command":"pageviewsTimestampDF.select(month($\"timestamp\")).distinct().show()","commandVersion":0,"state":"finished","results":null,"errorSummary":null,"error":null,"workflows":[],"startTime":0.0,"submitTime":0.0,"finishTime":0.0,"collapsed":false,"bindings":{},"inputWidgets":{},"displayType":"table","width":"auto","height":"auto","xColumns":null,"yColumns":null,"pivotColumns":null,"pivotAggregation":null,"customPlotOptions":{},"commentThread":[],"commentsVisible":false,"parentHierarchy":[],"diffInserts":[],"diffDeletes":[],"globalVars":{},"latestUser":"","commandTitle":"","showCommandTitle":false,"hideCommandCode":false,"hideCommandResult":false,"iPythonMetadata":null,"streamStates":{},"nuid":"e190dd63-4118-4a2e-96d5-7629e7e44bcd"},{"version":"CommandV1","origId":503877321547004,"guid":"9b36fabb-1519-471d-819f-14a365afb6a7","subtype":"command","commandType":"auto","position":10.0,"command":"%md **Solutions to Question #6:** Why is there so much more traffic on Monday vs. other days of the week?","commandVersion":0,"state":"finished","results":null,"errorSummary":null,"error":null,"workflows":[],"startTime":0.0,"submitTime":0.0,"finishTime":0.0,"collapsed":false,"bindings":{},"inputWidgets":{},"displayType":"table","width":"auto","height":"auto","xColumns":null,"yColumns":null,"pivotColumns":null,"pivotAggregation":null,"customPlotOptions":{},"commentThread":[],"commentsVisible":false,"parentHierarchy":[],"diffInserts":[],"diffDeletes":[],"globalVars":{},"latestUser":"","commandTitle":"","showCommandTitle":false,"hideCommandCode":false,"hideCommandResult":false,"iPythonMetadata":null,"streamStates":{},"nuid":"ac453230-3e17-400b-a79f-1d25d90387e3"},{"version":"CommandV1","origId":503877321547005,"guid":"e328de73-c3f1-4acb-89fd-9c470758f778","subtype":"command","commandType":"auto","position":11.0,"command":"%md ** Challenge 4:** Can you figure out exactly why there was so much more traffic on Mondays?","commandVersion":0,"state":"finished","results":null,"errorSummary":null,"error":null,"workflows":[],"startTime":0.0,"submitTime":0.0,"finishTime":0.0,"collapsed":false,"bindings":{},"inputWidgets":{},"displayType":"table","width":"auto","height":"auto","xColumns":null,"yColumns":null,"pivotColumns":null,"pivotAggregation":null,"customPlotOptions":{},"commentThread":[],"commentsVisible":false,"parentHierarchy":[],"diffInserts":[],"diffDeletes":[],"globalVars":{},"latestUser":"","commandTitle":"","showCommandTitle":false,"hideCommandCode":false,"hideCommandResult":false,"iPythonMetadata":null,"streamStates":{},"nuid":"c370789a-73ca-42b3-932a-8b000a948c04"},{"version":"CommandV1","origId":503877321547006,"guid":"204091ae-d60c-4dd4-9a61-0dc58703ae19","subtype":"command","commandType":"auto","position":12.0,"command":"%md **Challenge 4, Hint #1:** - show them that there is a spike on day #110","commandVersion":0,"state":"finished","results":null,"errorSummary":null,"error":null,"workflows":[],"startTime":0.0,"submitTime":0.0,"finishTime":0.0,"collapsed":false,"bindings":{},"inputWidgets":{},"displayType":"table","width":"auto","height":"auto","xColumns":null,"yColumns":null,"pivotColumns":null,"pivotAggregation":null,"customPlotOptions":{},"commentThread":[],"commentsVisible":false,"parentHierarchy":[],"diffInserts":[],"diffDeletes":[],"globalVars":{},"latestUser":"","commandTitle":"","showCommandTitle":false,"hideCommandCode":false,"hideCommandResult":false,"iPythonMetadata":null,"streamStates":{},"nuid":"fe539d46-8188-41df-8609-6bd4a7a00552"},{"version":"CommandV1","origId":503877321547007,"guid":"af6b4bd7-486d-4452-af03-8e125a71c623","subtype":"command","commandType":"auto","position":13.0,"command":"// Group the data with dayofyear(..), sum the result, and then order by \"Day of year\"\n\nval pageviewsByDayOfYearDF = pageviewsTimestampDF.groupBy(dayofyear($\"timestamp\").alias(\"Day of year\")).sum().orderBy(\"Day of year\")\ndisplay(pageviewsByDayOfYearDF)\n\n// You really need to graph the results to \"see\" what is going on","commandVersion":0,"state":"finished","results":null,"errorSummary":null,"error":null,"workflows":[],"startTime":0.0,"submitTime":0.0,"finishTime":0.0,"collapsed":false,"bindings":{},"inputWidgets":{},"displayType":"table","width":"auto","height":"auto","xColumns":null,"yColumns":null,"pivotColumns":null,"pivotAggregation":null,"customPlotOptions":{},"commentThread":[],"commentsVisible":false,"parentHierarchy":[],"diffInserts":[],"diffDeletes":[],"globalVars":{},"latestUser":"","commandTitle":"","showCommandTitle":false,"hideCommandCode":false,"hideCommandResult":false,"iPythonMetadata":null,"streamStates":{},"nuid":"f8e96ead-25a3-40f9-be01-b2d8f5e4cc72"},{"version":"CommandV1","origId":503877321547008,"guid":"0e2927c3-c0c8-473f-8eb2-64813aa376db","subtype":"command","commandType":"auto","position":14.0,"command":"%md **Challenge 4, Hint #2:** - view all the data for day 110","commandVersion":0,"state":"finished","results":null,"errorSummary":null,"error":null,"workflows":[],"startTime":0.0,"submitTime":0.0,"finishTime":0.0,"collapsed":false,"bindings":{},"inputWidgets":{},"displayType":"table","width":"auto","height":"auto","xColumns":null,"yColumns":null,"pivotColumns":null,"pivotAggregation":null,"customPlotOptions":{},"commentThread":[],"commentsVisible":false,"parentHierarchy":[],"diffInserts":[],"diffDeletes":[],"globalVars":{},"latestUser":"","commandTitle":"","showCommandTitle":false,"hideCommandCode":false,"hideCommandResult":false,"iPythonMetadata":null,"streamStates":{},"nuid":"5711642d-7daf-4953-8ccc-0c66cf5361b5"},{"version":"CommandV1","origId":503877321547009,"guid":"cfbc28ff-f7f1-4f8d-811f-0d6991b0a4ff","subtype":"command","commandType":"auto","position":15.0,"command":"View all the data for day 110, start by adding a collumn for the day-of-year\n\nval pageviewsForDay110 = pageviewsTimestampDF.withColumn(\"Day of year\", dayofyear($\"timestamp\"))\ndisplay(pageviewsForDay110)","commandVersion":0,"state":"finished","results":null,"errorSummary":null,"error":null,"workflows":[],"startTime":0.0,"submitTime":0.0,"finishTime":0.0,"collapsed":false,"bindings":{},"inputWidgets":{},"displayType":"table","width":"auto","height":"auto","xColumns":null,"yColumns":null,"pivotColumns":null,"pivotAggregation":null,"customPlotOptions":{},"commentThread":[],"commentsVisible":false,"parentHierarchy":[],"diffInserts":[],"diffDeletes":[],"globalVars":{},"latestUser":"","commandTitle":"","showCommandTitle":false,"hideCommandCode":false,"hideCommandResult":false,"iPythonMetadata":null,"streamStates":{},"nuid":"2e743831-0cd8-4b21-be47-18fe6a53da2d"},{"version":"CommandV1","origId":503877321547010,"guid":"e0632603-bf87-4b3a-9c64-cf72d9dac0dc","subtype":"command","commandType":"auto","position":16.0,"command":"%md **Challenge 4, Hint #3:** - Now filter the data to only see day 110 ","commandVersion":0,"state":"finished","results":null,"errorSummary":null,"error":null,"workflows":[],"startTime":0.0,"submitTime":0.0,"finishTime":0.0,"collapsed":false,"bindings":{},"inputWidgets":{},"displayType":"table","width":"auto","height":"auto","xColumns":null,"yColumns":null,"pivotColumns":null,"pivotAggregation":null,"customPlotOptions":{},"commentThread":[],"commentsVisible":false,"parentHierarchy":[],"diffInserts":[],"diffDeletes":[],"globalVars":{},"latestUser":"","commandTitle":"","showCommandTitle":false,"hideCommandCode":false,"hideCommandResult":false,"iPythonMetadata":null,"streamStates":{},"nuid":"51914852-0543-4387-9587-05896a07f18d"},{"version":"CommandV1","origId":503877321547011,"guid":"77a374c1-9323-4cc4-a46b-25c503310a4e","subtype":"command","commandType":"auto","position":17.0,"command":"val pageviewsForDay110 = pageviewsTimestampDF.withColumn(\"Day of year\", dayofyear($\"timestamp\")).where($\"Day of year\" === 110)\ndisplay(pageviewsForDay110)","commandVersion":0,"state":"finished","results":null,"errorSummary":null,"error":null,"workflows":[],"startTime":0.0,"submitTime":0.0,"finishTime":0.0,"collapsed":false,"bindings":{},"inputWidgets":{},"displayType":"table","width":"auto","height":"auto","xColumns":null,"yColumns":null,"pivotColumns":null,"pivotAggregation":null,"customPlotOptions":{},"commentThread":[],"commentsVisible":false,"parentHierarchy":[],"diffInserts":[],"diffDeletes":[],"globalVars":{},"latestUser":"","commandTitle":"","showCommandTitle":false,"hideCommandCode":false,"hideCommandResult":false,"iPythonMetadata":null,"streamStates":{},"nuid":"da657d4e-d5fe-4b40-943c-82d486defb17"},{"version":"CommandV1","origId":503877321547012,"guid":"91859982-053d-4fde-a1ac-539b6e02da5f","subtype":"command","commandType":"auto","position":18.0,"command":"%md **Challenge 4, Hint #4:** - Sort the data by timestamp and site","commandVersion":0,"state":"finished","results":null,"errorSummary":null,"error":null,"workflows":[],"startTime":0.0,"submitTime":0.0,"finishTime":0.0,"collapsed":false,"bindings":{},"inputWidgets":{},"displayType":"table","width":"auto","height":"auto","xColumns":null,"yColumns":null,"pivotColumns":null,"pivotAggregation":null,"customPlotOptions":{},"commentThread":[],"commentsVisible":false,"parentHierarchy":[],"diffInserts":[],"diffDeletes":[],"globalVars":{},"latestUser":"","commandTitle":"","showCommandTitle":false,"hideCommandCode":false,"hideCommandResult":false,"iPythonMetadata":null,"streamStates":{},"nuid":"a66cf709-9487-4ef1-90e5-5e70e400db00"},{"version":"CommandV1","origId":503877321547013,"guid":"31cba1c0-f806-47e5-bde8-f1b3b89c1a54","subtype":"command","commandType":"auto","position":19.0,"command":"val pageviewsForDay110 = pageviewsTimestampDF.withColumn(\"Day of year\", dayofyear($\"timestamp\")).where($\"Day of year\" === 110).orderBy(\"timestamp\", \"site\")\ndisplay(pageviewsForDay110)","commandVersion":0,"state":"finished","results":null,"errorSummary":null,"error":null,"workflows":[],"startTime":0.0,"submitTime":0.0,"finishTime":0.0,"collapsed":false,"bindings":{},"inputWidgets":{},"displayType":"table","width":"auto","height":"auto","xColumns":null,"yColumns":null,"pivotColumns":null,"pivotAggregation":null,"customPlotOptions":{},"commentThread":[],"commentsVisible":false,"parentHierarchy":[],"diffInserts":[],"diffDeletes":[],"globalVars":{},"latestUser":"","commandTitle":"","showCommandTitle":false,"hideCommandCode":false,"hideCommandResult":false,"iPythonMetadata":null,"streamStates":{},"nuid":"3a9ff8dd-90a3-4962-8de1-1d4a9abaf4d2"}],"dashboards":[],"guid":"a38e4863-019d-4d8b-936e-5e49e4830423","globalVars":{},"iPythonMetadata":null,"inputWidgets":{}}