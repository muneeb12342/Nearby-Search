val url = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=32.083741,72.671860&radius=5000&type=restaurant&keyword=cruise&key=AIzaSyCusQdKq6XQTPGUwXOTwXuDHhOnzDpODSo"
val result = scala.io.Source.fromURL(url).mkString
println(result)