package dev.odes.celerity.app.main.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.Sorts;
import dev.odes.celerity.common.response.ResponseData;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.boot.autoconfigure.mongo.MongoClientFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.mongodb.client.model.Filters.eq;

/**
 * package: dev.odes.celerity.app.main.controller
 * class: IndexController
 * date: 2023/4/22 17:54
 * version: 1.0.0
 * description:
 */
@RestController
@RequestMapping(path = "/index")
public class IndexController {

  public ResponseData getIndex() {

    String uri = "<connection string uri>";
    try (MongoClient mongoClient = MongoClients.create(uri)) {
      MongoDatabase database = mongoClient.getDatabase("sample_mflix");
      MongoCollection<Document> collection = database.getCollection("movies");
      Bson projectionFields = Projections.fields(
        Projections.include("title", "imdb"),
        Projections.excludeId());
      Document doc = collection.find(eq("title", "The Room"))
        .projection(projectionFields)
        .sort(Sorts.descending("imdb.rating"))
        .first();
      if (doc == null) {
        System.out.println("No results found.");
      } else {
        System.out.println(doc.toJson());
      }
    }

    String index = "index";

    return new ResponseData(index);
  }
}
