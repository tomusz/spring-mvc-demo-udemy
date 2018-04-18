import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.*;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {


        String user ="sda"; // the user name
        String databaseName = "admin"; // the name of the database in which the user is defined
        char[] password = "sda".toCharArray(); // the password as a character array

        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));

        MongoCredential credential = MongoCredential.createCredential(user,databaseName,password);


        MongoClientOptions options = MongoClientOptions.builder().sslEnabled(true)
                .codecRegistry(pojoCodecRegistry)
                .build();


        MongoClient mongoClient = new MongoClient(Arrays.asList(
                new ServerAddress("cluster0-shard-00-00-eos78.mongodb.net",27017),
                new ServerAddress("cluster0-shard-00-01-eos78.mongodb.net",27017),
                new ServerAddress("cluster0-shard-00-02-eos78.mongodb.net",27017)),
                Arrays.asList(credential),
                options);





   /*     MongoCredential credential = MongoCredential.createCredential(user, databaseName, password);

        MongoClientOptions options = MongoClientOptions.builder().sslEnabled(true).build();

        MongoClient mongoClient = new MongoClient(new ServerAddress("cluster0-shard-00-00-eos78.mongodb.net", 27017),
                Arrays.asList(credential),
                options);*/


        MongoDatabase database = mongoClient.getDatabase("test");
        MongoCollection<Restaurant> coll = database.getCollection("restaurants",Restaurant.class);

/*        Document document = new Document("borough", "Toruń")
                        .append("name", "Kuchenne Objawienia")
                        .append("grades",Arrays.asList(new Document("grade","B"),new Document("score","50")));


        coll.insertOne(document);*/


       MongoCursor<Restaurant> iterator = coll.find(eq("borough","Poznań")).iterator();

        while(iterator.hasNext()){
/*            String json = iterator.next().toJson();
            System.out.println(json);*/

            Restaurant restaurant = iterator.next();
            System.out.println(restaurant.getName());

        }

        mongoClient.close();

    }

}
