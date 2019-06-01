import org.apache.spark.sql.types.{StructType, StructField, StringType, IntegerType, DoubleType};

val schema = new StructType().add("STATION",StringType,true).add("DATE",DateType,true).add("PRCP",DoubleType,true).add("SNOW",DoubleType,true).add("SNWD",DoubleType,true).add("TMAX",DoubleType,true).add("TMIN",DoubleType,true).add("ACMC",DoubleType,true).add("ACMH",DoubleType,true).add("ACSC",DoubleType,true).add("ACSH",DoubleType,true).add("AWND",DoubleType,true).add("EVAP",DoubleType,true).add("GAHT",DoubleType,true).add("MDEV",DoubleType,true).add("MDPR",DoubleType,true).add("MDSF",DoubleType,true).add("MDTN",DoubleType,true).add("MDTX",DoubleType,true).add("MDWM",DoubleType,true).add("MNPN",DoubleType,true).add("MXPN",DoubleType,true).add("PGTM",DoubleType,true).add("PSUN",DoubleType,true).add("SN01",DoubleType,true).add("SN02",DoubleType,true).add("SN03",DoubleType,true).add("SN11",DoubleType,true).add("SN12",DoubleType,true).add("SN13",DoubleType,true).add("SN14",DoubleType,true).add("SN21",DoubleType,true).add("SN22",DoubleType,true).add("SN23",DoubleType,true).add("SN31",DoubleType,true).add("SN32",DoubleType,true).add("SN33",DoubleType,true).add("SN34",DoubleType,true).add("SN35",DoubleType,true).add("SN36",DoubleType,true).add("SN51",DoubleType,true).add("SN52",DoubleType,true).add("SN53",DoubleType,true).add("SN54",DoubleType,true).add("SN55",DoubleType,true).add("SN56",DoubleType,true).add("SN57",DoubleType,true).add("SN61",DoubleType,true).add("SN72",DoubleType,true).add("SN81",DoubleType,true).add("SN82",DoubleType,true).add("SN83",DoubleType,true).add("SNOW",DoubleType,true).add("SNWD",DoubleType,true).add("SX01",DoubleType,true).add("SX02",DoubleType,true).add("SX03",DoubleType,true).add("SX11",DoubleType,true).add("SX12",DoubleType,true).add("SX13",DoubleType,true).add("SX14",DoubleType,true).add("SX15",DoubleType,true).add("SX17",DoubleType,true).add("SX21",DoubleType,true).add("SX22",DoubleType,true).add("SX23",DoubleType,true).add("SX31",DoubleType,true).add("SX32",DoubleType,true).add("SX33",DoubleType,true).add("SX34",DoubleType,true).add("SX35",DoubleType,true).add("SX36",DoubleType,true).add("SX51",DoubleType,true).add("SX52",DoubleType,true).add("SX53",DoubleType,true).add("SX54",DoubleType,true).add("SX55",DoubleType,true).add("SX56",DoubleType,true).add("SX57",DoubleType,true).add("SX61",DoubleType,true).add("SX72",DoubleType,true).add("SX81",DoubleType,true).add("SX82",DoubleType,true).add("SX83",DoubleType,true).add("TAVG",DoubleType,true).add("THIC",DoubleType,true).add("TMAX",DoubleType,true).add("TMIN",DoubleType,true).add("TOBS",DoubleType,true).add("TSUN",DoubleType,true).add("WDF1",DoubleType,true).add("WDF2",DoubleType,true).add("WDF5",DoubleType,true).add("WDFG",DoubleType,true).add("WDFI",DoubleType,true).add("WDFM",DoubleType,true).add("WDMV",DoubleType,true).add("WESD",DoubleType,true).add("WESF",DoubleType,true).add("WSF1",DoubleType,true).add("WSF2",DoubleType,true).add("WSF5",DoubleType,true).add("WSFG",DoubleType,true).add("WSFI",DoubleType,true).add("WSFM",DoubleType,true).add("WT01",DoubleType,true).add("WT02",DoubleType,true).add("WT03",DoubleType,true).add("WT04",DoubleType,true).add("WT05",DoubleType,true).add("WT06",DoubleType,true).add("WT07",DoubleType,true).add("WT08",DoubleType,true).add("WT09",DoubleType,true).add("WT10",DoubleType,true).add("WT11",DoubleType,true).add("WT12",DoubleType,true).add("WT13",DoubleType,true).add("WT14",DoubleType,true).add("WT15",DoubleType,true).add("WT16",DoubleType,true).add("WT17",DoubleType,true).add("WT18",DoubleType,true).add("WT19",DoubleType,true).add("WT21",DoubleType,true).add("WT22",DoubleType,true).add("WV01",DoubleType,true).add("WV03",DoubleType,true).add("WV07",DoubleType,true).add("WV18",DoubleType,true).add("WV20",DoubleType,true)
val df = sqlContext.read.format("com.databricks.spark.csv").option("header","true").option("dateFormat","YYYY-MM-DD").schema(schema).load("/user/sm8235/NOAA_Daily.csv")
df.registerTempTable("NOAA_Daily")
val df_cleaned = sqlContext.sql("""SELECT STATION,DATE,PRCP ,SNOW ,SNWD ,TMAX ,TMIN ,ACMC ,ACMH ,ACSC ,ACSH ,AWND ,EVAP ,GAHT ,MDEV ,MDPR ,MDSF ,MDTN ,MDTX ,MDWM ,MNPN ,MXPN ,PGTM ,PSUN ,SN01,SN02,SN03,SN11,SN12,SN13,SN14,SN21,SN22,SN23,SN31,SN32,SN33,SN34,SN35,SN36,SN51,SN52,SN53,SN54,SN55,SN56,SN57,SN61,SN72,SN81,SN82,SN83,SNOW,SNWD,SX01,SX02,SX03,SX11,SX12,SX13,SX14,SX15,SX17,SX21,SX22,SX23,SX31,SX32,SX33,SX34,SX35,SX36,SX51,SX52,SX53,SX54,SX55,SX56,SX57,SX61,SX72,SX81,SX82,SX83,TAVG,THIC,TMAX,TMIN,TOBS,TSUN,WDF1,WDF2,WDF5,WDFG,WDFI,WDFM,WDMV,WESD,WESF,WSF1,WSF2,WSF5,WSFG,WSFI,WSFM,WT01,WT02,WT03,WT04,WT05,WT06,WT07,WT08,WT09,WT10,WT11,WT12,WT13,WT14,WT15,WT16,WT17,WT18,WT19,WT21,WT22,WV01,WV03,WV07,WV18,WV20 FROM NOAA_Daily""")
df_cleaned.coalesce(1).write.format("com.databricks.spark.csv").option("header","true").save("/user/sm8235/NOAA_Daily_cleaned.csv")
val imputer = new Imputer().setInputCols(Array("PRCP","SNOW","SNWD","TMAX","TMIN","ACMC","ACMH","ACSC","ACSH","AWND","EVAP","GAHT","MDEV","MDPR","MDSF","MDTN","MDTX","MDWM","MNPN","MXPN","PGTM","PSUN","SN01","SN02","SN03","SN11","SN12","SN13","SN14","SN21","SN22","SN23","SN31","SN32","SN33","SN34","SN35","SN36","SN51","SN52","SN53","SN54","SN55","SN56","SN57","SN61","SN72","SN81","SN82","SN83","SNOW","SNWD","SX01","SX02","SX03","SX11","SX12","SX13","SX14","SX15","SX17","SX21","SX22","SX23","SX31","SX32","SX33","SX34","SX35","SX36","SX51","SX52","SX53","SX54","SX55","SX56","SX57","SX61","SX72","SX81","SX82","SX83","TAVG","THIC","TMAX","TMIN","TOBS","TSUN","WDF1","WDF2","WDF5","WDFG","WDFI","WDFM","WDMV","WESD","WESF","WSF1","WSF2","WSF5","WSFG","WSFI","WSFM","WT01","WT02","WT03","WT04","WT05","WT06","WT07","WT08","WT09","WT10","WT11","WT12","WT13","WT14","WT15","WT16","WT17","WT18","WT19","WT21","WT22","WV01","WV03","WV07","WV18","WV20")).setOutputCols(df.columns.map(c => s"${c}_imputed")).setStrategy("mean")
val df_temp = imputer.fit(df).transform(df)
val df_new = df_temp.drop(df_temp.col("MDTN")).drop(df_temp.col("MDTX"))
val imputer = new Imputer().setInputCols(Array("PRCP","SNOW","SNWD","TMAX","TMIN","ACMC","ACMH","ACSC","ACSH","AWND","EVAP","GAHT","MDEV","MDPR","MDSF","MDWM","MNPN","MXPN","PGTM","PSUN","SN01","SN02","SN03","SN11","SN12","SN13","SN14","SN21","SN22","SN23","SN31","SN32","SN33","SN34","SN35","SN36","SN51","SN52","SN53","SN54","SN55","SN56","SN57","SN61","SN72","SN81","SN82","SN83","SNOW","SNWD","SX01","SX02","SX03","SX11","SX12","SX13","SX14","SX15","SX17","SX21","SX22","SX23","SX31","SX32","SX33","SX34","SX35","SX36","SX51","SX52","SX53","SX54","SX55","SX56","SX57","SX61","SX72","SX81","SX82","SX83","TAVG","THIC","TMAX","TMIN","TOBS","TSUN","WDF1","WDF2","WDF5","WDFG","WDFI","WDFM","WDMV","WESD","WESF","WSF1","WSF2","WSF5","WSFG","WSFI","WSFM","WT01","WT02","WT03","WT04","WT05","WT06","WT07","WT08","WT09","WT10","WT11","WT12","WT13","WT14","WT15","WT16","WT17","WT18","WT19","WT21","WT22","WV01","WV03","WV07","WV18","WV20")).setOutputCols(Array("impute_PRCP","impute_SNOW","impute_SNWD","impute_TMAX","impute_TMIN","impute_ACMC","impute_ACMH","impute_ACSC","impute_ACSH","impute_AWND","impute_EVAP","impute_GAHT","impute_MDEV","impute_MDPR","impute_MDSF","impute_MDWM","impute_MNPN","impute_MXPN","impute_PGTM","impute_PSUN","impute_SN01","impute_SN02","impute_SN03","impute_SN11","impute_SN12","impute_SN13","impute_SN14","impute_SN21","impute_SN22","impute_SN23","impute_SN31","impute_SN32","impute_SN33","impute_SN34","impute_SN35","impute_SN36","impute_SN51","impute_SN52","impute_SN53","impute_SN54","impute_SN55","impute_SN56","impute_SN57","impute_SN61","impute_SN72","impute_SN81","impute_SN82","impute_SN83","impute_SNOW","impute_SNWD","impute_SX01","impute_SX02","impute_SX03","impute_SX11","impute_SX12","impute_SX13","impute_SX14","impute_SX15","impute_SX17","impute_SX21","impute_SX22","impute_SX23","impute_SX31","impute_SX32","impute_SX33","impute_SX34","impute_SX35","impute_SX36","impute_SX51","impute_SX52","impute_SX53","impute_SX54","impute_SX55","impute_SX56","impute_SX57","impute_SX61","impute_SX72","impute_SX81","impute_SX82","impute_SX83","impute_TAVG","impute_THIC","impute_TMAX","impute_TMIN","impute_TOBS","impute_TSUN","impute_WDF1","impute_WDF2","impute_WDF5","impute_WDFG","impute_WDFI","impute_WDFM","impute_WDMV","impute_WESD","impute_WESF","impute_WSF1","impute_WSF2","impute_WSF5","impute_WSFG","impute_WSFI","impute_WSFM","impute_WT01","impute_WT02","impute_WT03","impute_WT04","impute_WT05","impute_WT06","impute_WT07","impute_WT08","impute_WT09","impute_WT10","impute_WT11","impute_WT12","impute_WT13","impute_WT14","impute_WT15","impute_WT16","impute_WT17","impute_WT18","impute_WT19","impute_WT21","impute_WT22","impute_WV01","impute_WV03","impute_WV07","impute_WV18","impute_WV20")).setStrategy("mean")
val df_final = imputer.fit(df_new).transform(df_new)

/*********************************************************************/
val df_noaa = sqlContext.read.format("com.databricks.spark.csv").option("header","true").option("dateFormat","YYYY-MM-DD").option("inferSchema","true").load("/user/sm8235/NOAA_Complete.csv")
val df_noaa_geo = sqlContext.read.format("com.databricks.spark.csv").option("header","true").option("dateFormat","YYYY-MM-DD").option("inferSchema","true").load("/user/sm8235/Geo_Data/stations_with_geo.csv")
val df_as_noaa = df_noaa.as("df_noaa")
val df_as_noaa_geo = df_noaa_geo.as("df_noaa_geo")
val df_joined_noaa = df_as_noaa.join(df_as_noaa_geo, Seq("Station"))
df_joined_noaa.write.format("com.databricks.spark.csv").option("header","true").save("/user/sm8235/final_code/NOAA_CompleteWithGeo.csv")
df_joined_noaa.registerTempTable("noaa")
val df_temp = sqlContext.sql(""" SELECT Station,year(DATE) as year,month(DATE) as month,dayofmonth(DATE) as day,LATITUDE,LONGITUDE,ELEVATION,geometry,index_right,name,PRCP,TMAX,TMIN FROM noaa""")
df_temp.registerTempTable("noaa")
val df_agg = sqlContext.sql(""" SELECT Station,year,month,LATITUDE,LONGITUDE,ELEVATION,name,avg(impute_PRCP) as PRCP,avg(impute_SNOW) as SNOW,avg(impute_SNWD) as SNWD,avg(impute_TMAX) as TMAX,avg(impute_TMIN) as TMIN,avg(impute_ACMC) as ACMC,avg(impute_ACMH) as ACMH,avg(impute_ACSC) as ACSC,avg(impute_ACSH) as ACSH,avg(impute_AWND) as AWND,avg(impute_EVAP) as EVAP,avg(impute_GAHT) as GAHT,avg(impute_MDEV) as MDEV,avg(impute_MDPR) as MDPR,avg(impute_MDSF) as MDSF,avg(impute_MDWM) as MDWM,avg(impute_MNPN) as MNPN,avg(impute_MXPN) as MXPN,avg(impute_PGTM) as PGTM,avg(impute_PSUN) as PSUN,avg(impute_SN01) as SN01,avg(impute_SN02) as SN02,avg(impute_SN03) as SN03,avg(impute_SN11) as SN11,avg(impute_SN12) as SN12,avg(impute_SN13) as SN13,avg(impute_SN14) as SN14,avg(impute_SN21) as SN21,avg(impute_SN22) as SN22,avg(impute_SN23) as SN23,avg(impute_SN31) as SN31,avg(impute_SN32) as SN32,avg(impute_SN33) as SN33,avg(impute_SN34) as SN34,avg(impute_SN35) as SN35,avg(impute_SN36) as SN36,avg(impute_SN51) as SN51,avg(impute_SN52) as SN52,avg(impute_SN53) as SN53,avg(impute_SN54) as SN54,avg(impute_SN55) as SN55,avg(impute_SN56) as SN56,avg(impute_SN57) as SN57,avg(impute_SN61) as SN61,avg(impute_SN72) as SN72,avg(impute_SN81) as SN81,avg(impute_SN82) as SN82,avg(impute_SN83) as SN83,avg(impute_SX01) as SX01,avg(impute_SX02) as SX02,avg(impute_SX03) as SX03,avg(impute_SX11) as SX11,avg(impute_SX12) as SX12,avg(impute_SX13) as SX13,avg(impute_SX14) as SX14,avg(impute_SX15) as SX15,avg(impute_SX17) as SX17,avg(impute_SX21) as SX21,avg(impute_SX22) as SX22,avg(impute_SX23) as SX23,avg(impute_SX31) as SX31,avg(impute_SX32) as SX32,avg(impute_SX33) as SX33,avg(impute_SX34) as SX34,avg(impute_SX35) as SX35,avg(impute_SX36) as SX36,avg(impute_SX51) as SX51,avg(impute_SX52) as SX52,avg(impute_SX53) as SX53,avg(impute_SX54) as SX54,avg(impute_SX55) as SX55,avg(impute_SX56) as SX56,avg(impute_SX57) as SX57,avg(impute_SX61) as SX61,avg(impute_SX72) as SX72,avg(impute_SX81) as SX81,avg(impute_SX82) as SX82,avg(impute_SX83) as SX83,avg(impute_TAVG) as TAVG,avg(impute_THIC) as THIC,avg(impute_TOBS) as TOBS,avg(impute_TSUN) as TSUN,avg(impute_WDF1) as WDF1,avg(impute_WDF2) as WDF2,avg(impute_WDF5) as WDF5,avg(impute_WDFG) as WDFG,avg(impute_WDFI) as WDFI,avg(impute_WDFM) as WDFM,avg(impute_WDMV) as WDMV,avg(impute_WESD) as WESD,avg(impute_WESF) as WESF,avg(impute_WSF1) as WSF1,avg(impute_WSF2) as WSF2,avg(impute_WSF5) as WSF5,avg(impute_WSFG) as WSFG,avg(impute_WSFI) as WSFI,avg(impute_WSFM) as WSFM,avg(impute_WT01) as WT01,avg(impute_WT02) as WT02,avg(impute_WT03) as WT03,avg(impute_WT04) as WT04,avg(impute_WT05) as WT05,avg(impute_WT06) as WT06,avg(impute_WT07) as WT07,avg(impute_WT08) as WT08,avg(impute_WT09) as WT09,avg(impute_WT10) as WT10,avg(impute_WT11) as WT11,avg(impute_WT12) as WT12,avg(impute_WT13) as WT13,avg(impute_WT14) as WT14,avg(impute_WT15) as WT15,avg(impute_WT16) as WT16,avg(impute_WT17) as WT17,avg(impute_WT18) as WT18,avg(impute_WT19) as WT19,avg(impute_WT21) as WT21,avg(impute_WT22) as WT22,avg(impute_WV01) as WV01,avg(impute_WV03) as WV03,avg(impute_WV07) as WV07,avg(impute_WV18) as WV18,avg(impute_WV20) as WV20 FROM noaa GROUP BY Station,year,month,LATITUDE,LONGITUDE,ELEVATION,name""")
df_agg.coalesce(1).write.format("com.databricks.spark.csv").option("header","true").save("/user/sm8235/final/NOAA_final_month_agg.csv")
val df_storm = sqlContext.read.format("com.databricks.spark.csv").option("header","true").option("dateFormat","YYYY-MM-DD").option("inferSchema","true").load("/user/sm8235/Geo_Data/storm_with_geo.csv")
val df_rainfall = sqlContext.read.format("com.databricks.spark.csv").option("header","true").option("dateFormat","YYYY-MM-DD").option("inferSchema","true").load("/user/sm8235/Geo_Data/rainfall_with_geo.csv")
val df_rainfall_clean = df_rainfall.drop("Latitude").drop("Longitude").drop("geometry").drop("index_right")
val df_as_storm = df_storm.as("df_storm")
val df_as_rainfall = df_rainfall_clean.as("df_rainfall")
val df_as_noaa_agg = df_temp.as("df_noaa_agg")
val df_joined_noaa_storm = df_as_noaa_agg.join(df_as_storm, Seq("year","month","name"),"left_outer")
val df_joined_noaa_storm_clean = df_joined_noaa_storm.drop("begin_day").drop("state").drop("begin_lat").drop("begin_lon").drop("end_lat").drop("end_lon").drop("geometry").drop("index_right")
val df_as_noaa_storm_clean = df_joined_noaa_storm_clean.as("df_joined_noaa_storm_clean")
val df_joined_all = df_as_noaa_storm_clean.join(df_as_rainfall, Seq("year","month","name"),"left_outer")
df_joined_noaa_storm_clean.write.format("com.databricks.spark.csv").option("header","true").save("/user/sm8235/final_code/joined_noaa_storm_clean.csv")
df_joined_all.write.format("com.databricks.spark.csv").option("header","true").save("/user/sm8235/final_26/All_Merged_backup.csv")
val df_joined_all = df_joined_noaa_storm_clean
val df_joined_all_labeled = df_joined_all.withColumn("HasFlooded", when(col("event_type") ==="Flood","1").when(col("event_type") ==="Flash Flood","1").otherwise("0"))
val df_joined_all_labeled_final = df_joined_all_labeled.drop("event_type")
df_joined_all_labeled_final.write.format("com.databricks.spark.csv").option("header","true").save("/user/sm8235/final_code/all_merged_final.csv")
/*******************************Part 3 of code****************************************/
val df = sqlContext.read.format("com.databricks.spark.csv").option("header","true").option("dateFormat","YYYY-MM-DD").option("inferschema","true").load("/user/sm8235/final_code/all_merged_final.csv")
df.registerTempTable("FloodPrediction")
val df_new = sqlContext.sql("""SELECT HasFlooded,ELEVATION,PRCP,TMAX,TMIN FROM FloodPrediction""")
df_new.write.format("com.databricks.spark.csv").option("header","true").save("/user/sm8235/final_code/FloodPrediction_7pm.csv")
val data = sqlContext.read.format("libsvm").load("/user/sm8235/final_code/floodPrediction_dataset_7pm_libsvm.txt")
df_joined_all_labeled_final.registerTempTable("FloodPrediction")
val df_new = sqlContext.sql("""SELECT HasFlooded,ELEVATION,PRCP,TMAX,TMIN FROM FloodPrediction""")
df_new.write.format("com.databricks.spark.csv").option("header","true").save("/user/sm8235/final_code/FloodPrediction_7pm.csv")
val df_noaa = sqlContext.read.format("com.databricks.spark.csv").option("header","true").option("dateFormat","YYYY-MM-DD").option("inferSchema","true").load("/user/sm8235/final_code/NOAA_Complete.csv")
df3.write.format("com.databricks.spark.csv").option("header","true").save("/user/sm8235/final_code/NOAA_Complete.csv")
val df_noaa = sqlContext.read.format("com.databricks.spark.csv").option("header","true").option("dateFormat","YYYY-MM-DD").option("inferSchema","true").load("/user/sm8235/final_code/all_merged_final.csv")
val df_noaa = sqlContext.read.format("com.databricks.spark.csv").option("header","true").option("dateFormat","YYYY-MM-DD").option("inferSchema","true").load("/user/sm8235/final_code/NOAA_CompleteWithGeo.csv")
df_joined_noaa.write.format("com.databricks.spark.csv").option("header","true").save("/user/sm8235/final_code/NOAA_CompleteWithGeo.csv")
df_noaa.registerTempTable("noaa")
val df_new = sqlContext.sql("""SELECT year,month,name AS county,LATITUDE,LONGITUDE,ELEVATION,PRCP,TMAX,TMIN FROM noaa WHERE year = "2017" AND year != "year" """)
val df_new = sqlContext.sql("""SELECT HasFlooded,ELEVATION,PRCP,TMAX,TMIN FROM noaa WHERE year = "2017" AND """)
df_new.coalesce(1).write.format("com.databricks.spark.csv").option("header","true").save("/user/sm8235/final_code/DATA_FOR_TABLEAU.csv")
