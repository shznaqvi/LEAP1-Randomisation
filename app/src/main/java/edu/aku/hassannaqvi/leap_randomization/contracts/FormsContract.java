package edu.aku.hassannaqvi.leap_randomization.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

/**
 * Created by hassan.naqvi on 10/25/2016.
 */

public class FormsContract {

    private final String projectName = "CBT 2016-17";
    private final String surveyType = "SN";
    private String userName = "";
    private String ID = "";
    private String UID = "";
    private String hhDT = ""; // Date
    private String tehsil = "0000"; // Tehsil code
    private String hFacility = ""; // HF
    private String uccode = ""; // uc code
    private String villagename = ""; // Village code
    private String lhwCode = ""; // lhw Code
    private String houseHold = ""; // HH no.
    private String childId = ""; // Index Child ID
    private String iStatus = ""; // Form Status
    private String tagId = "";
    private String sA = "";
    private String sitenumber = "";
    private String mrnumber = "";
    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsTime = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String synced = "";
    private String synced_date = "";

    public FormsContract() {
    }

    public FormsContract sync(JSONObject jsonObject) throws JSONException {
        this.ID = jsonObject.getString(singleForm.COLUMN_ID);
        this.UID = jsonObject.getString(singleForm.COLUMN_UID);
        this.hhDT = jsonObject.getString(singleForm.COLUMN_HHDT);
        this.tehsil = jsonObject.getString(singleForm.COLUMN_TEHSIL);
        this.hFacility = jsonObject.getString(singleForm.COLUMN_HFACILITY);
        this.lhwCode = jsonObject.getString(singleForm.COLUMN_LHWCODE);
        this.houseHold = jsonObject.getString(singleForm.COLUMN_HOUSEHOLD);
        this.childId = jsonObject.getString(singleForm.COLUMN_CHILDID);
        this.uccode = jsonObject.getString(singleForm.COLUMN_UCCODE);
        this.villagename = jsonObject.getString(singleForm.COLUMN_VILLAGENAME);
        this.iStatus = jsonObject.getString(singleForm.COLUMN_ISTATUS);
        this.userName = jsonObject.getString(singleForm.COLUMN_NAME_USERNAME);
        this.tagId = jsonObject.getString(singleForm.COLUMN_DEVICETAGID);
        this.sA = jsonObject.getString(singleForm.COLUMN_SA);
        this.sitenumber = jsonObject.getString(singleForm.COLUMN_SITENUMBER);
        this.mrnumber = jsonObject.getString(singleForm.COLUMN_MRNUMBER);
        this.gpsLat = jsonObject.getString(singleForm.COLUMN_GPSLAT);
        this.gpsLng = jsonObject.getString(singleForm.COLUMN_GPSLNG);
        this.gpsTime = jsonObject.getString(singleForm.COLUMN_GPSTIME);
        this.gpsAcc = jsonObject.getString(singleForm.COLUMN_GPSACC);
        this.deviceID = jsonObject.getString(singleForm.COLUMN_DEVICEID);
        this.synced = jsonObject.getString(singleForm.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(singleForm.COLUMN_SYNCED_DATE);


        return this;
    }

    public String getProjectName() {

        return projectName;
    }

    public String getSurveyType() {
        return surveyType;
    }

    public String getTagId() {

        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getHhDT() {
        return hhDT;
    }

    public void setHhDT(String hhDT) {
        this.hhDT = hhDT;
    }

    public String getTehsil() {
        return tehsil;
    }

    public void setTehsil(String tehsil) {
        this.tehsil = tehsil;
    }

    public String gethFacility() {
        return hFacility;
    }

    public void sethFacility(String hFacility) {
        this.hFacility = hFacility;
    }

    public String getLhwCode() {
        return lhwCode;
    }

    public void setLhwCode(String lhwCode) {
        this.lhwCode = lhwCode;
    }

    public String getHouseHold() {
        return houseHold;
    }

    public void setHouseHold(String houseHold) {
        this.houseHold = houseHold;
    }

    public String getChildId() {
        return childId;
    }

    public void setChildId(String childId) {
        this.childId = childId;
    }

    public String getUccode() {
        return uccode;
    }

    public void setUccode(String uccode) {
        this.uccode = uccode;
    }

    public String getVillagename() {
        return villagename;
    }

    public void setVillagename(String villagename) {
        this.villagename = villagename;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getsA() {
        return sA;
    }

    public void setsA(String sA) {
        this.sA = sA;
    }

    public String getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(String gpsLat) {
        this.gpsLat = gpsLat;
    }

    public String getGpsLng() {
        return gpsLng;
    }

    public void setGpsLng(String gpsLng) {
        this.gpsLng = gpsLng;
    }

    public String getGpsTime() {
        return gpsTime;
    }

    public void setGpsTime(String gpsTime) {
        this.gpsTime = gpsTime;
    }

    public String getGpsAcc() {
        return gpsAcc;
    }

    public void setGpsAcc(String gpsAcc) {
        this.gpsAcc = gpsAcc;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSynced_date() {
        return synced_date;
    }

    public void setSynced_date(String synced_date) {
        this.synced_date = synced_date;
    }

    public String getSitenumber() {
        return sitenumber;
    }

    public void setSitenumber(String sitenumber) {
        this.sitenumber = sitenumber;
    }

    public String getMrnumber() {
        return mrnumber;
    }

    public void setMrnumber(String mrnumber) {
        this.mrnumber = mrnumber;
    }

    public FormsContract hydrate(Cursor cursor) {
        this.ID = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_ID));
        this.UID = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_UID));
        this.hhDT = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_HHDT));
        this.tehsil = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_TEHSIL));
        this.hFacility = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_HFACILITY));
        this.lhwCode = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_LHWCODE));
        this.houseHold = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_HOUSEHOLD));
        this.childId = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_CHILDID));
        this.uccode = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_UCCODE));
        this.villagename = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_VILLAGENAME));
        this.iStatus = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_ISTATUS));
        this.userName = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_NAME_USERNAME));
        this.tagId = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_DEVICETAGID));
        this.sA = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SA));
        this.sitenumber = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SITENUMBER));
        this.mrnumber = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_MRNUMBER));
        this.gpsLat = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_GPSLAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_GPSLNG));
        this.gpsTime = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_GPSTIME));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_GPSACC));
        this.deviceID = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_DEVICEID));
        this.synced = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(singleForm.COLUMN_SYNCED_DATE));


        return this;
    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(singleForm.COLUMN_PROJECT_NAME, this.projectName == null ? JSONObject.NULL : this.projectName);
        json.put(singleForm.COLUMN_SURVEY_TYPE, this.surveyType == null ? JSONObject.NULL : this.surveyType);
        json.put(singleForm.COLUMN_ID, this.ID == null ? JSONObject.NULL : this.ID);
        json.put(singleForm.COLUMN_UID, this.UID == null ? JSONObject.NULL : this.UID);
        json.put(singleForm.COLUMN_HHDT, this.hhDT == null ? JSONObject.NULL : this.hhDT);
        json.put(singleForm.COLUMN_TEHSIL, this.tehsil == null ? JSONObject.NULL : this.tehsil);
        json.put(singleForm.COLUMN_HFACILITY, this.hFacility == null ? JSONObject.NULL : this.hFacility);
        json.put(singleForm.COLUMN_LHWCODE, this.lhwCode == null ? JSONObject.NULL : this.lhwCode);
        json.put(singleForm.COLUMN_HOUSEHOLD, this.houseHold == null ? JSONObject.NULL : this.houseHold);
        json.put(singleForm.COLUMN_CHILDID, this.childId == null ? JSONObject.NULL : this.childId);
        json.put(singleForm.COLUMN_UCCODE, this.uccode == null ? JSONObject.NULL : this.uccode);
        json.put(singleForm.COLUMN_VILLAGENAME, this.villagename == null ? JSONObject.NULL : this.villagename);
        json.put(singleForm.COLUMN_ISTATUS, this.iStatus == null ? JSONObject.NULL : this.iStatus);
        json.put(singleForm.COLUMN_NAME_USERNAME, this.userName == null ? JSONObject.NULL : this.userName);
        json.put(singleForm.COLUMN_DEVICETAGID, this.tagId == null ? JSONObject.NULL : this.tagId);
        json.put(singleForm.COLUMN_SA, this.sA == null ? JSONObject.NULL : new JSONObject(this.sA));
        json.put(singleForm.COLUMN_SITENUMBER, this.sitenumber == null ? JSONObject.NULL : this.sitenumber);
        json.put(singleForm.COLUMN_MRNUMBER, this.mrnumber == null ? JSONObject.NULL : this.mrnumber);
        json.put(singleForm.COLUMN_GPSLAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
        json.put(singleForm.COLUMN_GPSLNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
        json.put(singleForm.COLUMN_GPSTIME, this.gpsTime == null ? JSONObject.NULL : this.gpsTime);
        json.put(singleForm.COLUMN_GPSACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
        json.put(singleForm.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(singleForm.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(singleForm.COLUMN_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);

        return json;
    }

    public JSONObject jsonMerge(JSONObject o1, JSONObject o2) throws JSONException {

        JSONObject jm = new JSONObject();

        //I assume that your two JSONObjects are o1 and o2
        JSONObject mergedObj = new JSONObject();

        Iterator i1 = o1.keys();
        Iterator i2 = o2.keys();
        String tmp_key;
        while (i1.hasNext()) {
            tmp_key = (String) i1.next();
            mergedObj.put(tmp_key, o1.get(tmp_key));
        }
        while (i2.hasNext()) {
            tmp_key = (String) i2.next();
            mergedObj.put(tmp_key, o2.get(tmp_key));
        }

        return mergedObj;
    }

    public static abstract class singleForm implements BaseColumns {

        public static final String TABLE_NAME = "rforms";
        public static final String URI = "/syncrforms.php";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectname";
        public static final String COLUMN_SURVEY_TYPE = "surveytype";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "uid";
        public static final String COLUMN_HHDT = "hhdt";
        public static final String COLUMN_TEHSIL = "tehsil";
        public static final String COLUMN_HFACILITY = "hfacility";
        public static final String COLUMN_LHWCODE = "lhwcode";
        public static final String COLUMN_HOUSEHOLD = "household";
        public static final String COLUMN_CHILDID = "childid";
        public static final String COLUMN_UCCODE = "uccode";
        public static final String COLUMN_VILLAGENAME = "villagename";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_NAME_USERNAME = "username";
        public static final String COLUMN_DEVICETAGID = "tagId";
        public static final String COLUMN_SA = "sa";
        public static final String COLUMN_SITENUMBER = "sitenumber";
        public static final String COLUMN_MRNUMBER = "mrnumber";
        public static final String COLUMN_GPSLAT = "gpslat";
        public static final String COLUMN_GPSLNG = "gpslng";
        public static final String COLUMN_GPSTIME = "gpstime";
        public static final String COLUMN_GPSACC = "gpsacc";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";

    }
}


