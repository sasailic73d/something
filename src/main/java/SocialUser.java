import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SocialUser {
    private String id;
    private String email;
    private String name;
    private String image;
    private String token;
    private String idToken;
    private String provider;

    public SocialUser() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SocialUser id(String id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SocialUser email(String email) {
        this.email = email;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SocialUser name(String name) {
        this.name = name;
        return this;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public SocialUser image(String image) {
        this.image = image;
        return  this;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public SocialUser token(String token) {
        this.token = token;
        return this;
    }

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String ifToken) {
        this.idToken = ifToken;
    }

    public SocialUser idToken(String ifToken) {
        this.idToken = ifToken;
        return this;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public SocialUser provider(String provider) {
        this.provider = provider;
        return this;
    }

    public Set<String> getScope() {
        Set<String> scope = new HashSet<>();
        scope.add("https://www.googleapis.com/auth/plus.me");
        scope.add("https://www.googleapis.com/auth/userinfo.email");
        return scope;
    }

    public Map<String, Object> getAdditionalInformation() {
        Map<String, Object> info = new HashMap<>() ;
        info.put("id_token", idToken);
        return info;
    }
}
