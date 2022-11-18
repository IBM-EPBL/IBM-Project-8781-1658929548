private void getLocationPermission()
{
Log.d(TAG, "getLocationPermission: getting location permissions"); String[] permissions ={ Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION
};
if
(ContextCompat.checkSelfPermission(this.getApplicationContext(), FINE_LOCATION) == PackageManager.PERMISSION_GRANTED)
{
if
 
(ContextCompat.checkSelfPermission(this.getApplicationContext(), COURSE_LOCATION) == PackageManager.PERMISSION_GRANTED) { mLocationPermissionsGranted = true;
initMap();
}
else {
ActivityCompat.requestPermissions(this, permissions, LOCATION_PERMISSION_REQUEST_CODE);
}
}
else {
ActivityCompat.requestPermissions(this, permissions, LOCATION_PERMISSION_REQUEST_CODE);
}

}
