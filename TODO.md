1. Earnings calendar
2. Central Bank calendar
3. BLS calendar
4. Construction releases calendar
5. Retail sales, Redbook, ISM, Fed surveys
6. CPI, PPI, Jobless Claims, GDP, Employment 

Divide calendars into current and lagging (simply based on what time the data covers, whether the months before or "realtime"). 

Bug:
Appears to rely on a specific old version of TWS jtsclient.jar 
otherwise compilation of IBWrapper fails since method marketDataType in trait EWrapper of type (x$1: Int, x$2: Int)Unit is not defined
