/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/spau/Documents/work/XivelyAndroidServiceDemo/src/com/xively/android/service/IHttpService.aidl
 */
package com.xively.android.service;
public interface IHttpService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.xively.android.service.IHttpService
{
private static final java.lang.String DESCRIPTOR = "com.xively.android.service.IHttpService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.xively.android.service.IHttpService interface,
 * generating a proxy if needed.
 */
public static com.xively.android.service.IHttpService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.xively.android.service.IHttpService))) {
return ((com.xively.android.service.IHttpService)iin);
}
return new com.xively.android.service.IHttpService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_setApiKey:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.setApiKey(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_createFeed:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.xively.android.service.Response _result = this.createFeed(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_updateFeed:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
com.xively.android.service.Response _result = this.updateFeed(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_listFeed:
{
data.enforceInterface(DESCRIPTOR);
com.xively.android.service.Response _result = this.listFeed();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getFeed:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
com.xively.android.service.Response _result = this.getFeed(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_deleteFeed:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
com.xively.android.service.Response _result = this.deleteFeed(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_createDatastream:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
com.xively.android.service.Response _result = this.createDatastream(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_updateDatastream:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
com.xively.android.service.Response _result = this.updateDatastream(_arg0, _arg1, _arg2);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_listDatastream:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
com.xively.android.service.Response _result = this.listDatastream(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getDatastream:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
com.xively.android.service.Response _result = this.getDatastream(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_deleteDatastream:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
com.xively.android.service.Response _result = this.deleteDatastream(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_createDatapoint:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
com.xively.android.service.Response _result = this.createDatapoint(_arg0, _arg1, _arg2);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_updateDatapoint:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
com.xively.android.service.Response _result = this.updateDatapoint(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getDatapoint:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
com.xively.android.service.Response _result = this.getDatapoint(_arg0, _arg1, _arg2);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_deleteDatapoint:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
com.xively.android.service.Response _result = this.deleteDatapoint(_arg0, _arg1, _arg2);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_createKey:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.xively.android.service.Response _result = this.createKey(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_updateKey:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
com.xively.android.service.Response _result = this.updateKey(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_listKey:
{
data.enforceInterface(DESCRIPTOR);
com.xively.android.service.Response _result = this.listKey();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getKey:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.xively.android.service.Response _result = this.getKey(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_deleteKey:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.xively.android.service.Response _result = this.deleteKey(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_createTrigger:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.xively.android.service.Response _result = this.createTrigger(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_updateTrigger:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
com.xively.android.service.Response _result = this.updateTrigger(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_listTrigger:
{
data.enforceInterface(DESCRIPTOR);
com.xively.android.service.Response _result = this.listTrigger();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getTrigger:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
com.xively.android.service.Response _result = this.getTrigger(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_deleteTrigger:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
com.xively.android.service.Response _result = this.deleteTrigger(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.xively.android.service.IHttpService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void setApiKey(java.lang.String apiKey) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(apiKey);
mRemote.transact(Stub.TRANSACTION_setApiKey, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public com.xively.android.service.Response createFeed(java.lang.String body) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(body);
mRemote.transact(Stub.TRANSACTION_createFeed, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response updateFeed(int feedId, java.lang.String body) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(feedId);
_data.writeString(body);
mRemote.transact(Stub.TRANSACTION_updateFeed, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response listFeed() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_listFeed, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response getFeed(int feedId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(feedId);
mRemote.transact(Stub.TRANSACTION_getFeed, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response deleteFeed(int feedId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(feedId);
mRemote.transact(Stub.TRANSACTION_deleteFeed, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response createDatastream(int feedId, java.lang.String body) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(feedId);
_data.writeString(body);
mRemote.transact(Stub.TRANSACTION_createDatastream, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response updateDatastream(int feedId, java.lang.String datastreamId, java.lang.String body) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(feedId);
_data.writeString(datastreamId);
_data.writeString(body);
mRemote.transact(Stub.TRANSACTION_updateDatastream, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response listDatastream(int feedId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(feedId);
mRemote.transact(Stub.TRANSACTION_listDatastream, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response getDatastream(int feedId, java.lang.String datastreamId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(feedId);
_data.writeString(datastreamId);
mRemote.transact(Stub.TRANSACTION_getDatastream, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response deleteDatastream(int feedId, java.lang.String datastreamId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(feedId);
_data.writeString(datastreamId);
mRemote.transact(Stub.TRANSACTION_deleteDatastream, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response createDatapoint(int feedId, java.lang.String datastreamId, java.lang.String body) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(feedId);
_data.writeString(datastreamId);
_data.writeString(body);
mRemote.transact(Stub.TRANSACTION_createDatapoint, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response updateDatapoint(int feedId, java.lang.String datastreamId, java.lang.String datapointAt, java.lang.String body) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(feedId);
_data.writeString(datastreamId);
_data.writeString(datapointAt);
_data.writeString(body);
mRemote.transact(Stub.TRANSACTION_updateDatapoint, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response getDatapoint(int feedId, java.lang.String datastreamId, java.lang.String datapointAt) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(feedId);
_data.writeString(datastreamId);
_data.writeString(datapointAt);
mRemote.transact(Stub.TRANSACTION_getDatapoint, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response deleteDatapoint(int feedId, java.lang.String datastreamId, java.lang.String datapointAt) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(feedId);
_data.writeString(datastreamId);
_data.writeString(datapointAt);
mRemote.transact(Stub.TRANSACTION_deleteDatapoint, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response createKey(java.lang.String body) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(body);
mRemote.transact(Stub.TRANSACTION_createKey, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response updateKey(java.lang.String keyId, java.lang.String body) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(keyId);
_data.writeString(body);
mRemote.transact(Stub.TRANSACTION_updateKey, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response listKey() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_listKey, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response getKey(java.lang.String keyId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(keyId);
mRemote.transact(Stub.TRANSACTION_getKey, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response deleteKey(java.lang.String keyId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(keyId);
mRemote.transact(Stub.TRANSACTION_deleteKey, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response createTrigger(java.lang.String body) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(body);
mRemote.transact(Stub.TRANSACTION_createTrigger, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response updateTrigger(int triggerId, java.lang.String body) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(triggerId);
_data.writeString(body);
mRemote.transact(Stub.TRANSACTION_updateTrigger, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response listTrigger() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_listTrigger, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response getTrigger(int triggerId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(triggerId);
mRemote.transact(Stub.TRANSACTION_getTrigger, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.xively.android.service.Response deleteTrigger(int triggerId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.xively.android.service.Response _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(triggerId);
mRemote.transact(Stub.TRANSACTION_deleteTrigger, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.xively.android.service.Response.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_setApiKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_createFeed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_updateFeed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_listFeed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getFeed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_deleteFeed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_createDatastream = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_updateDatastream = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_listDatastream = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getDatastream = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_deleteDatastream = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_createDatapoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_updateDatapoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getDatapoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_deleteDatapoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_createKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_updateKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_listKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_deleteKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_createTrigger = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_updateTrigger = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_listTrigger = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_getTrigger = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_deleteTrigger = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
}
public void setApiKey(java.lang.String apiKey) throws android.os.RemoteException;
public com.xively.android.service.Response createFeed(java.lang.String body) throws android.os.RemoteException;
public com.xively.android.service.Response updateFeed(int feedId, java.lang.String body) throws android.os.RemoteException;
public com.xively.android.service.Response listFeed() throws android.os.RemoteException;
public com.xively.android.service.Response getFeed(int feedId) throws android.os.RemoteException;
public com.xively.android.service.Response deleteFeed(int feedId) throws android.os.RemoteException;
public com.xively.android.service.Response createDatastream(int feedId, java.lang.String body) throws android.os.RemoteException;
public com.xively.android.service.Response updateDatastream(int feedId, java.lang.String datastreamId, java.lang.String body) throws android.os.RemoteException;
public com.xively.android.service.Response listDatastream(int feedId) throws android.os.RemoteException;
public com.xively.android.service.Response getDatastream(int feedId, java.lang.String datastreamId) throws android.os.RemoteException;
public com.xively.android.service.Response deleteDatastream(int feedId, java.lang.String datastreamId) throws android.os.RemoteException;
public com.xively.android.service.Response createDatapoint(int feedId, java.lang.String datastreamId, java.lang.String body) throws android.os.RemoteException;
public com.xively.android.service.Response updateDatapoint(int feedId, java.lang.String datastreamId, java.lang.String datapointAt, java.lang.String body) throws android.os.RemoteException;
public com.xively.android.service.Response getDatapoint(int feedId, java.lang.String datastreamId, java.lang.String datapointAt) throws android.os.RemoteException;
public com.xively.android.service.Response deleteDatapoint(int feedId, java.lang.String datastreamId, java.lang.String datapointAt) throws android.os.RemoteException;
public com.xively.android.service.Response createKey(java.lang.String body) throws android.os.RemoteException;
public com.xively.android.service.Response updateKey(java.lang.String keyId, java.lang.String body) throws android.os.RemoteException;
public com.xively.android.service.Response listKey() throws android.os.RemoteException;
public com.xively.android.service.Response getKey(java.lang.String keyId) throws android.os.RemoteException;
public com.xively.android.service.Response deleteKey(java.lang.String keyId) throws android.os.RemoteException;
public com.xively.android.service.Response createTrigger(java.lang.String body) throws android.os.RemoteException;
public com.xively.android.service.Response updateTrigger(int triggerId, java.lang.String body) throws android.os.RemoteException;
public com.xively.android.service.Response listTrigger() throws android.os.RemoteException;
public com.xively.android.service.Response getTrigger(int triggerId) throws android.os.RemoteException;
public com.xively.android.service.Response deleteTrigger(int triggerId) throws android.os.RemoteException;
}
