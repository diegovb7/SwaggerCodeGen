# DefaultApi

All URIs are relative to *https://api.themoviedb.org/3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dELETEAuthenticationSession**](DefaultApi.md#dELETEAuthenticationSession) | **DELETE** /authentication/session | Delete Session
[**dELETEListListId**](DefaultApi.md#dELETEListListId) | **DELETE** /list/{list_id} | Delete List
[**dELETEMovieMovieIdRating**](DefaultApi.md#dELETEMovieMovieIdRating) | **DELETE** /movie/{movie_id}/rating | Delete Rating
[**dELETETvTvIdRating**](DefaultApi.md#dELETETvTvIdRating) | **DELETE** /tv/{tv_id}/rating | Delete Rating
[**dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating**](DefaultApi.md#dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating) | **DELETE** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating | Delete Rating
[**gETAccount**](DefaultApi.md#gETAccount) | **GET** /account | Get Details
[**gETAccountAccountIdFavoriteMovies**](DefaultApi.md#gETAccountAccountIdFavoriteMovies) | **GET** /account/{account_id}/favorite/movies | Get Favorite Movies
[**gETAccountAccountIdFavoriteTv**](DefaultApi.md#gETAccountAccountIdFavoriteTv) | **GET** /account/{account_id}/favorite/tv | Get Favorite TV Shows
[**gETAccountAccountIdLists**](DefaultApi.md#gETAccountAccountIdLists) | **GET** /account/{account_id}/lists | Get Created Lists
[**gETAccountAccountIdRatedMovies**](DefaultApi.md#gETAccountAccountIdRatedMovies) | **GET** /account/{account_id}/rated/movies | Get Rated Movies
[**gETAccountAccountIdRatedTv**](DefaultApi.md#gETAccountAccountIdRatedTv) | **GET** /account/{account_id}/rated/tv | Get Rated TV Shows
[**gETAccountAccountIdRatedTvEpisodes**](DefaultApi.md#gETAccountAccountIdRatedTvEpisodes) | **GET** /account/{account_id}/rated/tv/episodes | Get Rated TV Episodes
[**gETAccountAccountIdWatchlistMovies**](DefaultApi.md#gETAccountAccountIdWatchlistMovies) | **GET** /account/{account_id}/watchlist/movies | Get Movie Watchlist
[**gETAccountAccountIdWatchlistTv**](DefaultApi.md#gETAccountAccountIdWatchlistTv) | **GET** /account/{account_id}/watchlist/tv | Get TV Show Watchlist
[**gETAuthenticationGuestSessionNew**](DefaultApi.md#gETAuthenticationGuestSessionNew) | **GET** /authentication/guest_session/new | Create Guest Session
[**gETAuthenticationTokenNew**](DefaultApi.md#gETAuthenticationTokenNew) | **GET** /authentication/token/new | Create Request Token
[**gETCertificationMovieList**](DefaultApi.md#gETCertificationMovieList) | **GET** /certification/movie/list | Get Movie Certifications
[**gETCertificationTvList**](DefaultApi.md#gETCertificationTvList) | **GET** /certification/tv/list | Get TV Certifications
[**gETCollectionCollectionId**](DefaultApi.md#gETCollectionCollectionId) | **GET** /collection/{collection_id} | Get Details
[**gETCollectionCollectionIdImages**](DefaultApi.md#gETCollectionCollectionIdImages) | **GET** /collection/{collection_id}/images | Get Images
[**gETCollectionCollectionIdTranslations**](DefaultApi.md#gETCollectionCollectionIdTranslations) | **GET** /collection/{collection_id}/translations | Get Translations
[**gETCompanyCompanyId**](DefaultApi.md#gETCompanyCompanyId) | **GET** /company/{company_id} | Get Details
[**gETCompanyCompanyIdAlternativeNames**](DefaultApi.md#gETCompanyCompanyIdAlternativeNames) | **GET** /company/{company_id}/alternative_names | Get Alternative Names
[**gETCompanyCompanyIdImages**](DefaultApi.md#gETCompanyCompanyIdImages) | **GET** /company/{company_id}/images | Get Images
[**gETConfiguration**](DefaultApi.md#gETConfiguration) | **GET** /configuration | Get API Configuration
[**gETConfigurationCountries**](DefaultApi.md#gETConfigurationCountries) | **GET** /configuration/countries | Get Countries
[**gETConfigurationJobs**](DefaultApi.md#gETConfigurationJobs) | **GET** /configuration/jobs | Get Jobs
[**gETConfigurationLanguages**](DefaultApi.md#gETConfigurationLanguages) | **GET** /configuration/languages | Get Languages
[**gETConfigurationPrimaryTranslations**](DefaultApi.md#gETConfigurationPrimaryTranslations) | **GET** /configuration/primary_translations | Get Primary Translations
[**gETConfigurationTimezones**](DefaultApi.md#gETConfigurationTimezones) | **GET** /configuration/timezones | Get Timezones
[**gETCreditCreditId**](DefaultApi.md#gETCreditCreditId) | **GET** /credit/{credit_id} | Get Details
[**gETDiscoverMovie**](DefaultApi.md#gETDiscoverMovie) | **GET** /discover/movie | Movie Discover
[**gETDiscoverTv**](DefaultApi.md#gETDiscoverTv) | **GET** /discover/tv | TV Discover
[**gETFindExternalId**](DefaultApi.md#gETFindExternalId) | **GET** /find/{external_id} | Find by ID
[**gETGenreMovieList**](DefaultApi.md#gETGenreMovieList) | **GET** /genre/movie/list | Get Movie List
[**gETGenreTvList**](DefaultApi.md#gETGenreTvList) | **GET** /genre/tv/list | Get TV List
[**gETGuestSessionGuestSessionIdRatedMovies**](DefaultApi.md#gETGuestSessionGuestSessionIdRatedMovies) | **GET** /guest_session/{guest_session_id}/rated/movies | Get Rated Movies
[**gETGuestSessionGuestSessionIdRatedTv**](DefaultApi.md#gETGuestSessionGuestSessionIdRatedTv) | **GET** /guest_session/{guest_session_id}/rated/tv | Get Rated TV Shows
[**gETGuestSessionGuestSessionIdRatedTvEpisodes**](DefaultApi.md#gETGuestSessionGuestSessionIdRatedTvEpisodes) | **GET** /guest_session/{guest_session_id}/rated/tv/episodes | Get Rated TV Episodes
[**gETKeywordKeywordId**](DefaultApi.md#gETKeywordKeywordId) | **GET** /keyword/{keyword_id} | Get Details
[**gETKeywordKeywordIdMovies**](DefaultApi.md#gETKeywordKeywordIdMovies) | **GET** /keyword/{keyword_id}/movies | Get Movies
[**gETListListId**](DefaultApi.md#gETListListId) | **GET** /list/{list_id} | Get Details
[**gETListListIdItemStatus**](DefaultApi.md#gETListListIdItemStatus) | **GET** /list/{list_id}/item_status | Check Item Status
[**gETMovieChanges**](DefaultApi.md#gETMovieChanges) | **GET** /movie/changes | Get Movie Change List
[**gETMovieLatest**](DefaultApi.md#gETMovieLatest) | **GET** /movie/latest | Get Latest
[**gETMovieMovieId**](DefaultApi.md#gETMovieMovieId) | **GET** /movie/{movie_id} | Get Details
[**gETMovieMovieIdAccountStates**](DefaultApi.md#gETMovieMovieIdAccountStates) | **GET** /movie/{movie_id}/account_states | Get Account States
[**gETMovieMovieIdAlternativeTitles**](DefaultApi.md#gETMovieMovieIdAlternativeTitles) | **GET** /movie/{movie_id}/alternative_titles | Get Alternative Titles
[**gETMovieMovieIdChanges**](DefaultApi.md#gETMovieMovieIdChanges) | **GET** /movie/{movie_id}/changes | Get Changes
[**gETMovieMovieIdCredits**](DefaultApi.md#gETMovieMovieIdCredits) | **GET** /movie/{movie_id}/credits | Get Credits
[**gETMovieMovieIdExternalIds**](DefaultApi.md#gETMovieMovieIdExternalIds) | **GET** /movie/{movie_id}/external_ids | Get External IDs
[**gETMovieMovieIdImages**](DefaultApi.md#gETMovieMovieIdImages) | **GET** /movie/{movie_id}/images | Get Images
[**gETMovieMovieIdKeywords**](DefaultApi.md#gETMovieMovieIdKeywords) | **GET** /movie/{movie_id}/keywords | Get Keywords
[**gETMovieMovieIdLists**](DefaultApi.md#gETMovieMovieIdLists) | **GET** /movie/{movie_id}/lists | Get Lists
[**gETMovieMovieIdRecommendations**](DefaultApi.md#gETMovieMovieIdRecommendations) | **GET** /movie/{movie_id}/recommendations | Get Recommendations
[**gETMovieMovieIdReleaseDates**](DefaultApi.md#gETMovieMovieIdReleaseDates) | **GET** /movie/{movie_id}/release_dates | Get Release Dates
[**gETMovieMovieIdReviews**](DefaultApi.md#gETMovieMovieIdReviews) | **GET** /movie/{movie_id}/reviews | Get Reviews
[**gETMovieMovieIdSimilar**](DefaultApi.md#gETMovieMovieIdSimilar) | **GET** /movie/{movie_id}/similar | Get Similar Movies
[**gETMovieMovieIdTranslations**](DefaultApi.md#gETMovieMovieIdTranslations) | **GET** /movie/{movie_id}/translations | Get Translations
[**gETMovieMovieIdVideos**](DefaultApi.md#gETMovieMovieIdVideos) | **GET** /movie/{movie_id}/videos | Get Videos
[**gETMovieMovieIdWatchProviders**](DefaultApi.md#gETMovieMovieIdWatchProviders) | **GET** /movie/{movie_id}/watch/providers | Get Watch Providers
[**gETMovieNowPlaying**](DefaultApi.md#gETMovieNowPlaying) | **GET** /movie/now_playing | Get Now Playing
[**gETMoviePopular**](DefaultApi.md#gETMoviePopular) | **GET** /movie/popular | Get Popular
[**gETMovieTopRated**](DefaultApi.md#gETMovieTopRated) | **GET** /movie/top_rated | Get Top Rated
[**gETMovieUpcoming**](DefaultApi.md#gETMovieUpcoming) | **GET** /movie/upcoming | Get Upcoming
[**gETNetworkNetworkId**](DefaultApi.md#gETNetworkNetworkId) | **GET** /network/{network_id} | Get Details
[**gETNetworkNetworkIdAlternativeNames**](DefaultApi.md#gETNetworkNetworkIdAlternativeNames) | **GET** /network/{network_id}/alternative_names | Get Alternative Names
[**gETNetworkNetworkIdImages**](DefaultApi.md#gETNetworkNetworkIdImages) | **GET** /network/{network_id}/images | Get Images
[**gETPersonChanges**](DefaultApi.md#gETPersonChanges) | **GET** /person/changes | Get Person Change List
[**gETPersonLatest**](DefaultApi.md#gETPersonLatest) | **GET** /person/latest | Get Latest
[**gETPersonPersonId**](DefaultApi.md#gETPersonPersonId) | **GET** /person/{person_id} | Get Details
[**gETPersonPersonIdChanges**](DefaultApi.md#gETPersonPersonIdChanges) | **GET** /person/{person_id}/changes | Get Changes
[**gETPersonPersonIdCombinedCredits**](DefaultApi.md#gETPersonPersonIdCombinedCredits) | **GET** /person/{person_id}/combined_credits | Get Combined Credits
[**gETPersonPersonIdExternalIds**](DefaultApi.md#gETPersonPersonIdExternalIds) | **GET** /person/{person_id}/external_ids | Get External IDs
[**gETPersonPersonIdImages**](DefaultApi.md#gETPersonPersonIdImages) | **GET** /person/{person_id}/images | Get Images
[**gETPersonPersonIdMovieCredits**](DefaultApi.md#gETPersonPersonIdMovieCredits) | **GET** /person/{person_id}/movie_credits | Get Movie Credits
[**gETPersonPersonIdTaggedImages**](DefaultApi.md#gETPersonPersonIdTaggedImages) | **GET** /person/{person_id}/tagged_images | Get Tagged Images
[**gETPersonPersonIdTranslations**](DefaultApi.md#gETPersonPersonIdTranslations) | **GET** /person/{person_id}/translations | Get Translations
[**gETPersonPersonIdTvCredits**](DefaultApi.md#gETPersonPersonIdTvCredits) | **GET** /person/{person_id}/tv_credits | Get TV Credits
[**gETPersonPopular**](DefaultApi.md#gETPersonPopular) | **GET** /person/popular | Get Popular
[**gETReviewReviewId**](DefaultApi.md#gETReviewReviewId) | **GET** /review/{review_id} | Get Details
[**gETSearchCollection**](DefaultApi.md#gETSearchCollection) | **GET** /search/collection | Search Collections
[**gETSearchCompany**](DefaultApi.md#gETSearchCompany) | **GET** /search/company | Search Companies
[**gETSearchKeyword**](DefaultApi.md#gETSearchKeyword) | **GET** /search/keyword | Search Keywords
[**gETSearchMovie**](DefaultApi.md#gETSearchMovie) | **GET** /search/movie | Search Movies
[**gETSearchMulti**](DefaultApi.md#gETSearchMulti) | **GET** /search/multi | Multi Search
[**gETSearchPerson**](DefaultApi.md#gETSearchPerson) | **GET** /search/person | Search People
[**gETSearchTv**](DefaultApi.md#gETSearchTv) | **GET** /search/tv | Search TV Shows
[**gETTvAiringToday**](DefaultApi.md#gETTvAiringToday) | **GET** /tv/airing_today | Get TV Airing Today
[**gETTvChanges**](DefaultApi.md#gETTvChanges) | **GET** /tv/changes | Get TV Change List
[**gETTvEpisodeEpisodeIdChanges**](DefaultApi.md#gETTvEpisodeEpisodeIdChanges) | **GET** /tv/episode/{episode_id}/changes | Get Changes
[**gETTvEpisodeGroupId**](DefaultApi.md#gETTvEpisodeGroupId) | **GET** /tv/episode_group/{id} | Get Details
[**gETTvLatest**](DefaultApi.md#gETTvLatest) | **GET** /tv/latest | Get Latest
[**gETTvOnTheAir**](DefaultApi.md#gETTvOnTheAir) | **GET** /tv/on_the_air | Get TV On The Air
[**gETTvPopular**](DefaultApi.md#gETTvPopular) | **GET** /tv/popular | Get Popular
[**gETTvSeasonSeasonIdChanges**](DefaultApi.md#gETTvSeasonSeasonIdChanges) | **GET** /tv/season/{season_id}/changes | Get  Changes
[**gETTvTopRated**](DefaultApi.md#gETTvTopRated) | **GET** /tv/top_rated | Get Top Rated
[**gETTvTvId**](DefaultApi.md#gETTvTvId) | **GET** /tv/{tv_id} | Get Details
[**gETTvTvIdAccountStates**](DefaultApi.md#gETTvTvIdAccountStates) | **GET** /tv/{tv_id}/account_states | Get Account States
[**gETTvTvIdAlternativeTitles**](DefaultApi.md#gETTvTvIdAlternativeTitles) | **GET** /tv/{tv_id}/alternative_titles | Get Alternative Titles
[**gETTvTvIdChanges**](DefaultApi.md#gETTvTvIdChanges) | **GET** /tv/{tv_id}/changes | Get Changes
[**gETTvTvIdContentRatings**](DefaultApi.md#gETTvTvIdContentRatings) | **GET** /tv/{tv_id}/content_ratings | Get Content Ratings
[**gETTvTvIdEpisodeGroups**](DefaultApi.md#gETTvTvIdEpisodeGroups) | **GET** /tv/{tv_id}/episode_groups | Get Episode Groups
[**gETTvTvIdExternalIds**](DefaultApi.md#gETTvTvIdExternalIds) | **GET** /tv/{tv_id}/external_ids | Get External IDs
[**gETTvTvIdImages**](DefaultApi.md#gETTvTvIdImages) | **GET** /tv/{tv_id}/images | Get Images
[**gETTvTvIdKeywords**](DefaultApi.md#gETTvTvIdKeywords) | **GET** /tv/{tv_id}/keywords | Get Keywords
[**gETTvTvIdRecommendations**](DefaultApi.md#gETTvTvIdRecommendations) | **GET** /tv/{tv_id}/recommendations | Get Recommendations
[**gETTvTvIdReviews**](DefaultApi.md#gETTvTvIdReviews) | **GET** /tv/{tv_id}/reviews | Get Reviews
[**gETTvTvIdScreenedTheatrically**](DefaultApi.md#gETTvTvIdScreenedTheatrically) | **GET** /tv/{tv_id}/screened_theatrically | Get Screened Theatrically
[**gETTvTvIdSeasonSeasonNumberAccountStates**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberAccountStates) | **GET** /tv/{tv_id}/season/{season_number}/account_states | Get Account States
[**gETTvTvIdSeasonSeasonNumberCredits**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberCredits) | **GET** /tv/{tv_id}/season/{season_number}/credits | Get Credits
[**gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber) | **GET** /tv/{tv_id}/season/{season_number}/episode/{episode_number} | Get Details
[**gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates) | **GET** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/account_states | Get Account States
[**gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds) | **GET** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/external_ids | Get External IDs
[**gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages) | **GET** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/images | Get Images
[**gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations) | **GET** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/translations | Get Translations
[**gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos) | **GET** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/videos | Get  Videos
[**gETTvTvIdSeasonSeasonNumberExternalIds**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberExternalIds) | **GET** /tv/{tv_id}/season/{season_number}/external_ids | Get External IDs
[**gETTvTvIdSeasonSeasonNumberImages**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberImages) | **GET** /tv/{tv_id}/season/{season_number}/images | Get Images
[**gETTvTvIdSeasonSeasonNumberTranslations**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberTranslations) | **GET** /tv/{tv_id}/season/{season_number}/translations | Get Translations
[**gETTvTvIdSeasonSeasonNumberVideos**](DefaultApi.md#gETTvTvIdSeasonSeasonNumberVideos) | **GET** /tv/{tv_id}/season/{season_number}/videos | Get Videos
[**gETTvTvIdSimilar**](DefaultApi.md#gETTvTvIdSimilar) | **GET** /tv/{tv_id}/similar | Get Similar TV Shows
[**gETTvTvIdTranslations**](DefaultApi.md#gETTvTvIdTranslations) | **GET** /tv/{tv_id}/translations | Get Translations
[**gETTvTvIdVideos**](DefaultApi.md#gETTvTvIdVideos) | **GET** /tv/{tv_id}/videos | Get Videos
[**gETTvTvIdWatchProviders**](DefaultApi.md#gETTvTvIdWatchProviders) | **GET** /tv/{tv_id}/watch/providers | Get Watch Providers
[**gETWatchProvidersMovie**](DefaultApi.md#gETWatchProvidersMovie) | **GET** /watch/providers/movie | Get Movie Providers
[**gETWatchProvidersRegions**](DefaultApi.md#gETWatchProvidersRegions) | **GET** /watch/providers/regions | Get Available Regions
[**gETWatchProvidersTv**](DefaultApi.md#gETWatchProvidersTv) | **GET** /watch/providers/tv | Get TV Providers
[**pOSTAccountAccountIdFavorite**](DefaultApi.md#pOSTAccountAccountIdFavorite) | **POST** /account/{account_id}/favorite | Mark as Favorite
[**pOSTAccountAccountIdWatchlist**](DefaultApi.md#pOSTAccountAccountIdWatchlist) | **POST** /account/{account_id}/watchlist | Add to Watchlist
[**pOSTAuthenticationSessionConvert4**](DefaultApi.md#pOSTAuthenticationSessionConvert4) | **POST** /authentication/session/convert/4 | Create Session (from v4 access token)
[**pOSTAuthenticationSessionNew**](DefaultApi.md#pOSTAuthenticationSessionNew) | **POST** /authentication/session/new | Create Session
[**pOSTAuthenticationTokenValidateWithLogin**](DefaultApi.md#pOSTAuthenticationTokenValidateWithLogin) | **POST** /authentication/token/validate_with_login | Create Session With Login
[**pOSTList**](DefaultApi.md#pOSTList) | **POST** /list | Create List
[**pOSTListListIdAddItem**](DefaultApi.md#pOSTListListIdAddItem) | **POST** /list/{list_id}/add_item | Add Movie
[**pOSTListListIdClear**](DefaultApi.md#pOSTListListIdClear) | **POST** /list/{list_id}/clear | Clear List
[**pOSTListListIdRemoveItem**](DefaultApi.md#pOSTListListIdRemoveItem) | **POST** /list/{list_id}/remove_item | Remove Movie
[**pOSTMovieMovieIdRating**](DefaultApi.md#pOSTMovieMovieIdRating) | **POST** /movie/{movie_id}/rating | Rate Movie
[**pOSTTvTvIdRating**](DefaultApi.md#pOSTTvTvIdRating) | **POST** /tv/{tv_id}/rating | Rate TV Show
[**pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating**](DefaultApi.md#pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating) | **POST** /tv/{tv_id}/season/{season_number}/episode/{episode_number}/rating | Rate TV Episode


<a name="dELETEAuthenticationSession"></a>
# **dELETEAuthenticationSession**
> InlineResponse20050 dELETEAuthenticationSession(body)

Delete Session

If you would like to delete (or \&quot;logout\&quot;) from a session, call this method with a valid session ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Body5 body = new Body5(); // Body5 | 
try {
    InlineResponse20050 result = apiInstance.dELETEAuthenticationSession(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dELETEAuthenticationSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body5**](Body5.md)|  | [optional]

### Return type

[**InlineResponse20050**](InlineResponse20050.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dELETEListListId"></a>
# **dELETEListListId**
> InlineResponse4011 dELETEListListId(listId, sessionId)

Delete List

Delete a list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String listId = "listId_example"; // String | 
String sessionId = ""; // String | 
try {
    InlineResponse4011 result = apiInstance.dELETEListListId(listId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dELETEListListId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **String**|  |
 **sessionId** | **String**|  | [default to ]

### Return type

[**InlineResponse4011**](InlineResponse4011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dELETEMovieMovieIdRating"></a>
# **dELETEMovieMovieIdRating**
> InlineResponse4011 dELETEMovieMovieIdRating(movieId, contentType, guestSessionId, sessionId)

Delete Rating

Remove your rating for a movie.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String contentType = "application/json;charset=utf-8"; // String | 
String guestSessionId = "guestSessionId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    InlineResponse4011 result = apiInstance.dELETEMovieMovieIdRating(movieId, contentType, guestSessionId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dELETEMovieMovieIdRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8]
 **guestSessionId** | **String**|  | [optional]
 **sessionId** | **String**|  | [optional]

### Return type

[**InlineResponse4011**](InlineResponse4011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dELETETvTvIdRating"></a>
# **dELETETvTvIdRating**
> InlineResponse4011 dELETETvTvIdRating(tvId, contentType, guestSessionId, sessionId)

Delete Rating

Remove your rating for a TV show.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
String contentType = "application/json;charset=utf-8"; // String | 
String guestSessionId = "guestSessionId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    InlineResponse4011 result = apiInstance.dELETETvTvIdRating(tvId, contentType, guestSessionId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dELETETvTvIdRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8]
 **guestSessionId** | **String**|  | [optional]
 **sessionId** | **String**|  | [optional]

### Return type

[**InlineResponse4011**](InlineResponse4011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating"></a>
# **dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating**
> InlineResponse4011 dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating(tvId, seasonNumber, episodeNumber, contentType, guestSessionId, sessionId)

Delete Rating

Remove your rating for a TV episode.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
Integer episodeNumber = 56; // Integer | 
String contentType = "application/json;charset=utf-8"; // String | 
String guestSessionId = "guestSessionId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    InlineResponse4011 result = apiInstance.dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating(tvId, seasonNumber, episodeNumber, contentType, guestSessionId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dELETETvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |
 **episodeNumber** | **Integer**|  |
 **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8]
 **guestSessionId** | **String**|  | [optional]
 **sessionId** | **String**|  | [optional]

### Return type

[**InlineResponse4011**](InlineResponse4011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAccount"></a>
# **gETAccount**
> InlineResponse20090 gETAccount(sessionId)

Get Details

Get your account details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String sessionId = ""; // String | 
try {
    InlineResponse20090 result = apiInstance.gETAccount(sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**|  | [default to ]

### Return type

[**InlineResponse20090**](InlineResponse20090.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAccountAccountIdFavoriteMovies"></a>
# **gETAccountAccountIdFavoriteMovies**
> InlineResponse2002 gETAccountAccountIdFavoriteMovies(accountId, sessionId)

Get Favorite Movies

Get the list of your favorite movies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer accountId = 56; // Integer | 
String sessionId = ""; // String | 
try {
    InlineResponse2002 result = apiInstance.gETAccountAccountIdFavoriteMovies(accountId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAccountAccountIdFavoriteMovies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**|  |
 **sessionId** | **String**|  | [default to ]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAccountAccountIdFavoriteTv"></a>
# **gETAccountAccountIdFavoriteTv**
> InlineResponse20011 gETAccountAccountIdFavoriteTv(accountId, sessionId)

Get Favorite TV Shows

Get the list of your favorite TV shows.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer accountId = 56; // Integer | 
String sessionId = ""; // String | 
try {
    InlineResponse20011 result = apiInstance.gETAccountAccountIdFavoriteTv(accountId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAccountAccountIdFavoriteTv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**|  |
 **sessionId** | **String**|  | [default to ]

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAccountAccountIdLists"></a>
# **gETAccountAccountIdLists**
> InlineResponse20088 gETAccountAccountIdLists(accountId, sessionId, apiKey)

Get Created Lists

Get all of the lists created by an account. Will invlude private lists if you are the owner.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer accountId = 56; // Integer | 
String sessionId = ""; // String | 
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse20088 result = apiInstance.gETAccountAccountIdLists(accountId, sessionId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAccountAccountIdLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**|  |
 **sessionId** | **String**|  | [default to ]
 **apiKey** | **String**|  | [optional]

### Return type

[**InlineResponse20088**](InlineResponse20088.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAccountAccountIdRatedMovies"></a>
# **gETAccountAccountIdRatedMovies**
> InlineResponse20026 gETAccountAccountIdRatedMovies(accountId, sessionId)

Get Rated Movies

Get a list of all the movies you have rated.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer accountId = 56; // Integer | 
String sessionId = ""; // String | 
try {
    InlineResponse20026 result = apiInstance.gETAccountAccountIdRatedMovies(accountId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAccountAccountIdRatedMovies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**|  |
 **sessionId** | **String**|  | [default to ]

### Return type

[**InlineResponse20026**](InlineResponse20026.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAccountAccountIdRatedTv"></a>
# **gETAccountAccountIdRatedTv**
> InlineResponse20062 gETAccountAccountIdRatedTv(accountId, sessionId)

Get Rated TV Shows

Get a list of all the TV shows you have rated.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer accountId = 56; // Integer | 
String sessionId = ""; // String | 
try {
    InlineResponse20062 result = apiInstance.gETAccountAccountIdRatedTv(accountId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAccountAccountIdRatedTv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**|  |
 **sessionId** | **String**|  | [default to ]

### Return type

[**InlineResponse20062**](InlineResponse20062.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAccountAccountIdRatedTvEpisodes"></a>
# **gETAccountAccountIdRatedTvEpisodes**
> InlineResponse20081 gETAccountAccountIdRatedTvEpisodes(accountId, sessionId)

Get Rated TV Episodes

Get a list of all the TV episodes you have rated.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | 
String sessionId = ""; // String | 
try {
    InlineResponse20081 result = apiInstance.gETAccountAccountIdRatedTvEpisodes(accountId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAccountAccountIdRatedTvEpisodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  |
 **sessionId** | **String**|  | [default to ]

### Return type

[**InlineResponse20081**](InlineResponse20081.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAccountAccountIdWatchlistMovies"></a>
# **gETAccountAccountIdWatchlistMovies**
> InlineResponse2002 gETAccountAccountIdWatchlistMovies(accountId, sessionId)

Get Movie Watchlist

Get a list of all the movies you have added to your watchlist.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer accountId = 56; // Integer | 
String sessionId = ""; // String | 
try {
    InlineResponse2002 result = apiInstance.gETAccountAccountIdWatchlistMovies(accountId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAccountAccountIdWatchlistMovies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**|  |
 **sessionId** | **String**|  | [default to ]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAccountAccountIdWatchlistTv"></a>
# **gETAccountAccountIdWatchlistTv**
> InlineResponse20011 gETAccountAccountIdWatchlistTv(accountId, sessionId)

Get TV Show Watchlist

Get a list of all the TV shows you have added to your watchlist.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer accountId = 56; // Integer | 
String sessionId = ""; // String | 
try {
    InlineResponse20011 result = apiInstance.gETAccountAccountIdWatchlistTv(accountId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAccountAccountIdWatchlistTv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**|  |
 **sessionId** | **String**|  | [default to ]

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAuthenticationGuestSessionNew"></a>
# **gETAuthenticationGuestSessionNew**
> InlineResponse20084 gETAuthenticationGuestSessionNew()

Create Guest Session

This method will let you create a new guest session. Guest sessions are a type of session that will let a user rate movies and TV shows but not require them to have a TMDB user account. More information about user authentication can be found [here](#docTextSection:NSZtgz7zptsiLYxXZ).  Please note, you should only generate a single guest session per user (or device) as you will be able to attach the ratings to a TMDB user account in the future. There is also IP limits in place so you should always make sure it&#39;s the end user doing the guest session actions.  If a guest session is not used for the first time within 24 hours, it will be automatically deleted.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20084 result = apiInstance.gETAuthenticationGuestSessionNew();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAuthenticationGuestSessionNew");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20084**](InlineResponse20084.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETAuthenticationTokenNew"></a>
# **gETAuthenticationTokenNew**
> InlineResponse20025 gETAuthenticationTokenNew()

Create Request Token

Create a temporary request token that can be used to validate a TMDB user login. More details about how this works can be found [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20025 result = apiInstance.gETAuthenticationTokenNew();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETAuthenticationTokenNew");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETCertificationMovieList"></a>
# **gETCertificationMovieList**
> InlineResponse20054 gETCertificationMovieList()

Get Movie Certifications

Get an up to date list of the officially supported movie certifications on TMDB.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20054 result = apiInstance.gETCertificationMovieList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCertificationMovieList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20054**](InlineResponse20054.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETCertificationTvList"></a>
# **gETCertificationTvList**
> InlineResponse20049 gETCertificationTvList()

Get TV Certifications

Get an up to date list of the officially supported TV show certifications on TMDB.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20049 result = apiInstance.gETCertificationTvList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCertificationTvList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20049**](InlineResponse20049.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETCollectionCollectionId"></a>
# **gETCollectionCollectionId**
> InlineResponse20015 gETCollectionCollectionId(collectionId)

Get Details

Get collection details by id.  #### Recent Changes  | **Date** | **Change** | | - | - | | March 16, 2018 | Added the [translations](#endpoint:bhcsxEgRvyk3N7FnD) method. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer collectionId = 56; // Integer | 
try {
    InlineResponse20015 result = apiInstance.gETCollectionCollectionId(collectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCollectionCollectionId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Integer**|  |

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETCollectionCollectionIdImages"></a>
# **gETCollectionCollectionIdImages**
> InlineResponse20045 gETCollectionCollectionIdImages(collectionId)

Get Images

Get the images for a collection by id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer collectionId = 56; // Integer | 
try {
    InlineResponse20045 result = apiInstance.gETCollectionCollectionIdImages(collectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCollectionCollectionIdImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Integer**|  |

### Return type

[**InlineResponse20045**](InlineResponse20045.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETCollectionCollectionIdTranslations"></a>
# **gETCollectionCollectionIdTranslations**
> InlineResponse20013 gETCollectionCollectionIdTranslations(collectionId)

Get Translations

Get the list translations for a collection by id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer collectionId = 56; // Integer | 
try {
    InlineResponse20013 result = apiInstance.gETCollectionCollectionIdTranslations(collectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCollectionCollectionIdTranslations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Integer**|  |

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETCompanyCompanyId"></a>
# **gETCompanyCompanyId**
> InlineResponse2008 gETCompanyCompanyId(companyId)

Get Details

Get a companies details by id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer companyId = 56; // Integer | 
try {
    InlineResponse2008 result = apiInstance.gETCompanyCompanyId(companyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCompanyCompanyId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Integer**|  |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETCompanyCompanyIdAlternativeNames"></a>
# **gETCompanyCompanyIdAlternativeNames**
> InlineResponse20058 gETCompanyCompanyIdAlternativeNames(companyId)

Get Alternative Names

Get the alternative names of a company.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer companyId = 56; // Integer | 
try {
    InlineResponse20058 result = apiInstance.gETCompanyCompanyIdAlternativeNames(companyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCompanyCompanyIdAlternativeNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Integer**|  |

### Return type

[**InlineResponse20058**](InlineResponse20058.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETCompanyCompanyIdImages"></a>
# **gETCompanyCompanyIdImages**
> InlineResponse20023 gETCompanyCompanyIdImages(companyId)

Get Images

Get a companies logos by id.  There are two image formats that are supported for companies, PNG&#39;s and SVG&#39;s. You can see which type the original file is by looking at the &#x60;file_type&#x60; field. We prefer SVG&#39;s as they are resolution independent and as such, the width and height are only there to reflect the original asset that was uploaded. An SVG can be scaled properly beyond those dimensions if you call them as a PNG.  For more information about how SVG&#39;s and PNG&#39;s can be used, take a read through [this document](#docTextSection:mXP9B2uzoDJFguDZv).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer companyId = 56; // Integer | 
try {
    InlineResponse20023 result = apiInstance.gETCompanyCompanyIdImages(companyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCompanyCompanyIdImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Integer**|  |

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETConfiguration"></a>
# **gETConfiguration**
> InlineResponse20065 gETConfiguration(apiKey)

Get API Configuration

Get the system wide configuration information. Some elements of the API require some knowledge of this configuration data. The purpose of this is to try and keep the actual API responses as light as possible. It is recommended you cache this data within your application and check for updates every few days.  This method currently holds the data relevant to building image URLs as well as the change key map.  To build an image URL, you will need 3 pieces of data. The &#x60;base_url&#x60;, &#x60;size&#x60; and &#x60;file_path&#x60;. Simply combine them all and you will have a fully qualified URL. Here’s an example URL:      https://image.tmdb.org/t/p/w500/8uO0gUM8aNqYLs1OsTBQiXu0fEv.jpg  The configuration method also contains the list of change keys which can be useful if you are building an app that consumes data from the change feed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse20065 result = apiInstance.gETConfiguration(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  | [optional]

### Return type

[**InlineResponse20065**](InlineResponse20065.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETConfigurationCountries"></a>
# **gETConfigurationCountries**
> List&lt;InlineResponse20053&gt; gETConfigurationCountries(apiKey)

Get Countries

Get the list of countries (ISO 3166-1 tags) used throughout TMDB.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String apiKey = "apiKey_example"; // String | 
try {
    List<InlineResponse20053> result = apiInstance.gETConfigurationCountries(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETConfigurationCountries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  | [optional]

### Return type

[**List&lt;InlineResponse20053&gt;**](InlineResponse20053.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETConfigurationJobs"></a>
# **gETConfigurationJobs**
> List&lt;InlineResponse20074&gt; gETConfigurationJobs(apiKey)

Get Jobs

Get a list of the jobs and departments we use on TMDB.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String apiKey = "apiKey_example"; // String | 
try {
    List<InlineResponse20074> result = apiInstance.gETConfigurationJobs(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETConfigurationJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  | [optional]

### Return type

[**List&lt;InlineResponse20074&gt;**](InlineResponse20074.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETConfigurationLanguages"></a>
# **gETConfigurationLanguages**
> List&lt;InlineResponse20076&gt; gETConfigurationLanguages(apiKey)

Get Languages

Get the list of languages (ISO 639-1 tags) used throughout TMDB.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String apiKey = "apiKey_example"; // String | 
try {
    List<InlineResponse20076> result = apiInstance.gETConfigurationLanguages(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETConfigurationLanguages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  | [optional]

### Return type

[**List&lt;InlineResponse20076&gt;**](InlineResponse20076.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETConfigurationPrimaryTranslations"></a>
# **gETConfigurationPrimaryTranslations**
> List&lt;String&gt; gETConfigurationPrimaryTranslations(apiKey)

Get Primary Translations

Get a list of the _officially_ supported translations on TMDB.  While it&#39;s technically possible to add a translation in any one of the [languages](#endpoint:tem8QfFFyAfWodrCv) we have added to TMDB (we don&#39;t restrict content), the ones listed in this method are the ones we also support for localizing the website with which means they are what we refer to as the \&quot;primary\&quot; translations.  These are all specified as [IETF tags](https://en.wikipedia.org/wiki/IETF_language_tag) to identify the languages we use on TMDB. There is one exception which is image languages. They are currently only designated by a ISO-639-1 tag. This is a planned upgrade for the future.  We&#39;re always open to adding more if you think one should be added. You can ask about getting a new primary translation added by posting on [the forums](https://www.themoviedb.org/talk/category/5047951f760ee3318900009a).  One more thing to mention, these are the translations that map to our website translation project. You can view and contribute to that project [here](https://www.localeapp.com/projects/8267).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String apiKey = "apiKey_example"; // String | 
try {
    List<String> result = apiInstance.gETConfigurationPrimaryTranslations(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETConfigurationPrimaryTranslations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETConfigurationTimezones"></a>
# **gETConfigurationTimezones**
> List&lt;InlineResponse20072&gt; gETConfigurationTimezones(apiKey)

Get Timezones

Get the list of timezones used throughout TMDB.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String apiKey = "apiKey_example"; // String | 
try {
    List<InlineResponse20072> result = apiInstance.gETConfigurationTimezones(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETConfigurationTimezones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  | [optional]

### Return type

[**List&lt;InlineResponse20072&gt;**](InlineResponse20072.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETCreditCreditId"></a>
# **gETCreditCreditId**
> InlineResponse20044 gETCreditCreditId(creditId)

Get Details

Get a movie or TV credit details by id.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 13, 2018 | Movie credits are now supported. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String creditId = "creditId_example"; // String | 
try {
    InlineResponse20044 result = apiInstance.gETCreditCreditId(creditId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCreditCreditId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditId** | **String**|  |

### Return type

[**InlineResponse20044**](InlineResponse20044.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETDiscoverMovie"></a>
# **gETDiscoverMovie**
> InlineResponse200 gETDiscoverMovie(sortBy, certificationCountry, certification, certificationLte, certificationGte, includeAdult, includeVideo, language, page, primaryReleaseYear, primaryReleaseDateGte, primaryReleaseDateLte, releaseDateGte, releaseDateLte, withReleaseType, year, voteCountGte, voteCountLte, voteAverageGte, voteAverageLte, withCast, withCrew, withPeople, withCompanies, withGenres, withoutGenres, withKeywords, withoutKeywords, withRuntimeGte, withRuntimeLte, withOriginalLanguage, withWatchProviders, watchRegion, withWatchMonetizationTypes, withoutCompanies)

Movie Discover

Discover movies by different types of data like average rating, number of votes, genres and certifications. You can get a valid list of certifications from the [certifications list](#endpoint:faFKjuKG2HnwexAWM) method.  Discover also supports a nice list of sort options. See below for all of the available options.  Please note, when using &#x60;certification&#x60; \\ &#x60;certification.lte&#x60; you must also specify &#x60;certification_country&#x60;. These two parameters work together in order to filter the results. You can only filter results with the countries we have added to our [certifications list](#endpoint:faFKjuKG2HnwexAWM).  If you specify the &#x60;region&#x60; parameter, the regional release date will be used instead of the primary release date. The date returned will be the first date based on your query (ie. if a &#x60;with_release_type&#x60; is specified). It&#39;s important to note the order of the release types that are used. Specifying \&quot;2|3\&quot; would return the limited theatrical release date as opposed to \&quot;3|2\&quot; which would return the theatrical date.  Also note that a number of filters support being comma (&#x60;,&#x60;) or pipe (&#x60;|&#x60;) separated. Comma&#39;s are treated like an &#x60;AND&#x60; and query while pipe&#39;s are an &#x60;OR&#x60;.   Some examples of what can be done with discover can be found [here](https://www.themoviedb.org/documentation/api/discover).  #### Recent Changes  | **Date** | **Change** | | - | - | | November 18, 2021 | A new &#x60;without_companies&#x60; filter is available.| | April 13, 2021 | A new &#x60;with_watch_monetization_types&#x60; filter is available to use with &#x60;watch_region&#x60;.| | January 2, 2021 | A new set of filters are available for watch provider filtering. Check out &#x60;with_watch_providers&#x60; and &#x60;watch_region&#x60;.|

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String sortBy = "popularity.desc"; // String | Choose from one of the many available sort options.
String certificationCountry = "certificationCountry_example"; // String | Used in conjunction with the certification filter, use this to specify a country with a valid certification.
String certification = "certification_example"; // String | Filter results with a valid certification from the 'certification_country' field.
String certificationLte = "certificationLte_example"; // String | Filter and only include movies that have a certification that is less than or equal to the specified value.
String certificationGte = "certificationGte_example"; // String | Filter and only include movies that have a certification that is greater than or equal to the specified value.
Boolean includeAdult = false; // Boolean | A filter and include or exclude adult movies.
Boolean includeVideo = false; // Boolean | A filter to include or exclude videos.
String language = "en-US"; // String | Specify a language to query translatable fields with.
Integer page = 1; // Integer | Specify the page of results to query.
Integer primaryReleaseYear = 56; // Integer | A filter to limit the results to a specific primary release year.
LocalDate primaryReleaseDateGte = LocalDate.now(); // LocalDate | Filter and only include movies that have a primary release date that is greater or equal to the specified value.
LocalDate primaryReleaseDateLte = LocalDate.now(); // LocalDate | Filter and only include movies that have a primary release date that is less than or equal to the specified value.
LocalDate releaseDateGte = LocalDate.now(); // LocalDate | Filter and only include movies that have a release date (looking at all release dates) that is greater or equal to the specified value.
LocalDate releaseDateLte = LocalDate.now(); // LocalDate | Filter and only include movies that have a release date (looking at all release dates) that is less than or equal to the specified value.
Integer withReleaseType = 56; // Integer | Specify a comma (AND) or pipe (OR) separated value to filter release types by. These release types map to the same values found on the movie release date method.
Integer year = 56; // Integer | A filter to limit the results to a specific year (looking at all release dates).
Integer voteCountGte = 56; // Integer | Filter and only include movies that have a vote count that is greater or equal to the specified value.
Integer voteCountLte = 56; // Integer | Filter and only include movies that have a vote count that is less than or equal to the specified value.
BigDecimal voteAverageGte = new BigDecimal(); // BigDecimal | Filter and only include movies that have a rating that is greater or equal to the specified value.
BigDecimal voteAverageLte = new BigDecimal(); // BigDecimal | Filter and only include movies that have a rating that is less than or equal to the specified value.
String withCast = "withCast_example"; // String | A comma separated list of person ID's. Only include movies that have one of the ID's added as an actor.
String withCrew = "withCrew_example"; // String | A comma separated list of person ID's. Only include movies that have one of the ID's added as a crew member.
String withPeople = "withPeople_example"; // String | A comma separated list of person ID's. Only include movies that have one of the ID's added as a either a actor or a crew member.
String withCompanies = "withCompanies_example"; // String | A comma separated list of production company ID's. Only include movies that have one of the ID's added as a production company.
String withGenres = "withGenres_example"; // String | Comma separated value of genre ids that you want to include in the results.
String withoutGenres = "withoutGenres_example"; // String | Comma separated value of genre ids that you want to exclude from the results.
String withKeywords = "withKeywords_example"; // String | A comma separated list of keyword ID's. Only includes movies that have one of the ID's added as a keyword.
String withoutKeywords = "withoutKeywords_example"; // String | Exclude items with certain keywords. You can comma and pipe seperate these values to create an 'AND' or 'OR' logic.
Integer withRuntimeGte = 56; // Integer | Filter and only include movies that have a runtime that is greater or equal to a value.
Integer withRuntimeLte = 56; // Integer | Filter and only include movies that have a runtime that is less than or equal to a value.
String withOriginalLanguage = "withOriginalLanguage_example"; // String | Specify an ISO 639-1 string to filter results by their original language value.
String withWatchProviders = "withWatchProviders_example"; // String | A comma or pipe separated list of watch provider ID's. Combine this filter with `watch_region` in order to filter your results by a specific watch provider in a specific region.
String watchRegion = "watchRegion_example"; // String | An ISO 3166-1 code. Combine this filter with `with_watch_providers` in order to filter your results by a specific watch provider in a specific region.
String withWatchMonetizationTypes = "withWatchMonetizationTypes_example"; // String | In combination with `watch_region`, you can filter by monetization type.
String withoutCompanies = "withoutCompanies_example"; // String | Filter the results to exclude the specific production companies you specify here. `AND` / `OR` filters are supported.
try {
    InlineResponse200 result = apiInstance.gETDiscoverMovie(sortBy, certificationCountry, certification, certificationLte, certificationGte, includeAdult, includeVideo, language, page, primaryReleaseYear, primaryReleaseDateGte, primaryReleaseDateLte, releaseDateGte, releaseDateLte, withReleaseType, year, voteCountGte, voteCountLte, voteAverageGte, voteAverageLte, withCast, withCrew, withPeople, withCompanies, withGenres, withoutGenres, withKeywords, withoutKeywords, withRuntimeGte, withRuntimeLte, withOriginalLanguage, withWatchProviders, watchRegion, withWatchMonetizationTypes, withoutCompanies);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETDiscoverMovie");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sortBy** | **String**| Choose from one of the many available sort options. | [optional] [default to popularity.desc] [enum: , popularity.asc, popularity.desc, release_date.asc, release_date.desc, revenue.asc, revenue.desc, primary_release_date.asc, primary_release_date.desc, original_title.asc, original_title.desc, vote_average.asc, vote_average.desc, vote_count.asc, vote_count.desc]
 **certificationCountry** | **String**| Used in conjunction with the certification filter, use this to specify a country with a valid certification. | [optional]
 **certification** | **String**| Filter results with a valid certification from the &#39;certification_country&#39; field. | [optional]
 **certificationLte** | **String**| Filter and only include movies that have a certification that is less than or equal to the specified value. | [optional]
 **certificationGte** | **String**| Filter and only include movies that have a certification that is greater than or equal to the specified value. | [optional]
 **includeAdult** | **Boolean**| A filter and include or exclude adult movies. | [optional] [default to false]
 **includeVideo** | **Boolean**| A filter to include or exclude videos. | [optional] [default to false]
 **language** | **String**| Specify a language to query translatable fields with. | [optional] [default to en-US]
 **page** | **Integer**| Specify the page of results to query. | [optional] [default to 1]
 **primaryReleaseYear** | **Integer**| A filter to limit the results to a specific primary release year. | [optional]
 **primaryReleaseDateGte** | **LocalDate**| Filter and only include movies that have a primary release date that is greater or equal to the specified value. | [optional]
 **primaryReleaseDateLte** | **LocalDate**| Filter and only include movies that have a primary release date that is less than or equal to the specified value. | [optional]
 **releaseDateGte** | **LocalDate**| Filter and only include movies that have a release date (looking at all release dates) that is greater or equal to the specified value. | [optional]
 **releaseDateLte** | **LocalDate**| Filter and only include movies that have a release date (looking at all release dates) that is less than or equal to the specified value. | [optional]
 **withReleaseType** | **Integer**| Specify a comma (AND) or pipe (OR) separated value to filter release types by. These release types map to the same values found on the movie release date method. | [optional]
 **year** | **Integer**| A filter to limit the results to a specific year (looking at all release dates). | [optional]
 **voteCountGte** | **Integer**| Filter and only include movies that have a vote count that is greater or equal to the specified value. | [optional]
 **voteCountLte** | **Integer**| Filter and only include movies that have a vote count that is less than or equal to the specified value. | [optional]
 **voteAverageGte** | **BigDecimal**| Filter and only include movies that have a rating that is greater or equal to the specified value. | [optional]
 **voteAverageLte** | **BigDecimal**| Filter and only include movies that have a rating that is less than or equal to the specified value. | [optional]
 **withCast** | **String**| A comma separated list of person ID&#39;s. Only include movies that have one of the ID&#39;s added as an actor. | [optional]
 **withCrew** | **String**| A comma separated list of person ID&#39;s. Only include movies that have one of the ID&#39;s added as a crew member. | [optional]
 **withPeople** | **String**| A comma separated list of person ID&#39;s. Only include movies that have one of the ID&#39;s added as a either a actor or a crew member. | [optional]
 **withCompanies** | **String**| A comma separated list of production company ID&#39;s. Only include movies that have one of the ID&#39;s added as a production company. | [optional]
 **withGenres** | **String**| Comma separated value of genre ids that you want to include in the results. | [optional]
 **withoutGenres** | **String**| Comma separated value of genre ids that you want to exclude from the results. | [optional]
 **withKeywords** | **String**| A comma separated list of keyword ID&#39;s. Only includes movies that have one of the ID&#39;s added as a keyword. | [optional]
 **withoutKeywords** | **String**| Exclude items with certain keywords. You can comma and pipe seperate these values to create an &#39;AND&#39; or &#39;OR&#39; logic. | [optional]
 **withRuntimeGte** | **Integer**| Filter and only include movies that have a runtime that is greater or equal to a value. | [optional]
 **withRuntimeLte** | **Integer**| Filter and only include movies that have a runtime that is less than or equal to a value. | [optional]
 **withOriginalLanguage** | **String**| Specify an ISO 639-1 string to filter results by their original language value. | [optional]
 **withWatchProviders** | **String**| A comma or pipe separated list of watch provider ID&#39;s. Combine this filter with &#x60;watch_region&#x60; in order to filter your results by a specific watch provider in a specific region. | [optional]
 **watchRegion** | **String**| An ISO 3166-1 code. Combine this filter with &#x60;with_watch_providers&#x60; in order to filter your results by a specific watch provider in a specific region. | [optional]
 **withWatchMonetizationTypes** | **String**| In combination with &#x60;watch_region&#x60;, you can filter by monetization type. | [optional] [enum: flatrate, free, ads, rent, buy]
 **withoutCompanies** | **String**| Filter the results to exclude the specific production companies you specify here. &#x60;AND&#x60; / &#x60;OR&#x60; filters are supported. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETDiscoverTv"></a>
# **gETDiscoverTv**
> InlineResponse20030 gETDiscoverTv(sortBy, airDateGte, airDateLte, firstAirDateGte, firstAirDateLte, firstAirDateYear, language, page, timezone, voteAverageGte, voteCountGte, withGenres, withNetworks, withoutGenres, withRuntimeGte, withRuntimeLte, includeNullFirstAirDates, withOriginalLanguage, withoutKeywords, screenedTheatrically, withCompanies, withKeywords, withWatchProviders, watchRegion, withWatchMonetizationTypes, withStatus, withType, withoutCompanies)

TV Discover

Discover TV shows by different types of data like average rating, number of votes, genres, the network they aired on and air dates.  Discover also supports a nice list of sort options. See below for all of the available options.  Also note that a number of filters support being comma (&#x60;,&#x60;) or pipe (&#x60;|&#x60;) separated. Comma&#39;s are treated like an &#x60;AND&#x60; and query while pipe&#39;s are an &#x60;OR&#x60;.   Some examples of what can be done with discover can be found [here](https://www.themoviedb.org/documentation/api/discover).  #### Recent Changes  | **Date** | **Change** | | - | - | | November 18, 2021 | Some new filters are available: &#x60;with_status&#x60;, &#x60;with_type&#x60; and &#x60;without_companies&#x60;.| | April 13, 2021 | A new &#x60;with_watch_monetization_types&#x60; filter is available to use with &#x60;watch_region&#x60;.| | January 2, 2021 | A new set of filters are available for watch provider filtering. Check out &#x60;with_watch_providers&#x60; and &#x60;watch_region&#x60;.|

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String sortBy = "popularity.desc"; // String | Choose from one of the many available sort options.
LocalDate airDateGte = LocalDate.now(); // LocalDate | Filter and only include TV shows that have a air date (by looking at all episodes) that is greater or equal to the specified value.
LocalDate airDateLte = LocalDate.now(); // LocalDate | Filter and only include TV shows that have a air date (by looking at all episodes) that is less than or equal to the specified value.
LocalDate firstAirDateGte = LocalDate.now(); // LocalDate | Filter and only include TV shows that have a original air date that is greater or equal to the specified value. Can be used in conjunction with the \"include_null_first_air_dates\" filter if you want to include items with no air date.
LocalDate firstAirDateLte = LocalDate.now(); // LocalDate | Filter and only include TV shows that have a original air date that is less than or equal to the specified value. Can be used in conjunction with the \"include_null_first_air_dates\" filter if you want to include items with no air date.
Integer firstAirDateYear = 56; // Integer | Filter and only include TV shows that have a original air date year that equal to the specified value. Can be used in conjunction with the \"include_null_first_air_dates\" filter if you want to include items with no air date.
String language = "en-US"; // String | Specify a language to query translatable fields with.
Integer page = 1; // Integer | Specify the page of results to query.
String timezone = "America/New_York"; // String | Used in conjunction with the air_date.gte/lte filter to calculate the proper UTC offset.
BigDecimal voteAverageGte = new BigDecimal(); // BigDecimal | Filter and only include movies that have a rating that is greater or equal to the specified value.
Integer voteCountGte = 56; // Integer | Filter and only include movies that have a rating that is less than or equal to the specified value.
String withGenres = "withGenres_example"; // String | Comma separated value of genre ids that you want to include in the results.
String withNetworks = "withNetworks_example"; // String | Comma separated value of network ids that you want to include in the results.
String withoutGenres = "withoutGenres_example"; // String | Comma separated value of genre ids that you want to exclude from the results.
Integer withRuntimeGte = 56; // Integer | Filter and only include TV shows with an episode runtime that is greater than or equal to a value.
Integer withRuntimeLte = 56; // Integer | Filter and only include TV shows with an episode runtime that is less than or equal to a value.
Boolean includeNullFirstAirDates = false; // Boolean | Use this filter to include TV shows that don't have an air date while using any of the \"first_air_date\" filters.
String withOriginalLanguage = "withOriginalLanguage_example"; // String | Specify an ISO 639-1 string to filter results by their original language value.
String withoutKeywords = "withoutKeywords_example"; // String | Exclude items with certain keywords. You can comma and pipe seperate these values to create an 'AND' or 'OR' logic.
Boolean screenedTheatrically = true; // Boolean | Filter results to include items that have been screened theatrically.
String withCompanies = "withCompanies_example"; // String | A comma separated list of production company ID's. Only include movies that have one of the ID's added as a production company.
String withKeywords = "withKeywords_example"; // String | A comma separated list of keyword ID's. Only includes TV shows that have one of the ID's added as a keyword.
String withWatchProviders = "withWatchProviders_example"; // String | A comma or pipe separated list of watch provider ID's. Combine this filter with `watch_region` in order to filter your results by a specific watch provider in a specific region.
String watchRegion = "watchRegion_example"; // String | An ISO 3166-1 code. Combine this filter with `with_watch_providers` in order to filter your results by a specific watch provider in a specific region.
String withWatchMonetizationTypes = "withWatchMonetizationTypes_example"; // String | In combination with `watch_region`, you can filter by monetization type.
String withStatus = "withStatus_example"; // String | Filter TV shows by their status.  Returning Series: 0 Planned: 1 In Production: 2 Ended: 3 Cancelled: 4 Pilot: 5
String withType = "withType_example"; // String | Filter TV shows by their type.  Documentary: 0 News: 1 Miniseries: 2 Reality: 3 Scripted: 4 Talk Show: 5 Video: 6
String withoutCompanies = "withoutCompanies_example"; // String | Filter the results to exclude the specific production companies you specify here. `AND` / `OR` filters are supported.
try {
    InlineResponse20030 result = apiInstance.gETDiscoverTv(sortBy, airDateGte, airDateLte, firstAirDateGte, firstAirDateLte, firstAirDateYear, language, page, timezone, voteAverageGte, voteCountGte, withGenres, withNetworks, withoutGenres, withRuntimeGte, withRuntimeLte, includeNullFirstAirDates, withOriginalLanguage, withoutKeywords, screenedTheatrically, withCompanies, withKeywords, withWatchProviders, watchRegion, withWatchMonetizationTypes, withStatus, withType, withoutCompanies);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETDiscoverTv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sortBy** | **String**| Choose from one of the many available sort options. | [optional] [default to popularity.desc] [enum: , vote_average.desc, vote_average.asc, first_air_date.desc, first_air_date.asc, popularity.desc, popularity.asc]
 **airDateGte** | **LocalDate**| Filter and only include TV shows that have a air date (by looking at all episodes) that is greater or equal to the specified value. | [optional]
 **airDateLte** | **LocalDate**| Filter and only include TV shows that have a air date (by looking at all episodes) that is less than or equal to the specified value. | [optional]
 **firstAirDateGte** | **LocalDate**| Filter and only include TV shows that have a original air date that is greater or equal to the specified value. Can be used in conjunction with the \&quot;include_null_first_air_dates\&quot; filter if you want to include items with no air date. | [optional]
 **firstAirDateLte** | **LocalDate**| Filter and only include TV shows that have a original air date that is less than or equal to the specified value. Can be used in conjunction with the \&quot;include_null_first_air_dates\&quot; filter if you want to include items with no air date. | [optional]
 **firstAirDateYear** | **Integer**| Filter and only include TV shows that have a original air date year that equal to the specified value. Can be used in conjunction with the \&quot;include_null_first_air_dates\&quot; filter if you want to include items with no air date. | [optional]
 **language** | **String**| Specify a language to query translatable fields with. | [optional] [default to en-US]
 **page** | **Integer**| Specify the page of results to query. | [optional] [default to 1]
 **timezone** | **String**| Used in conjunction with the air_date.gte/lte filter to calculate the proper UTC offset. | [optional] [default to America/New_York]
 **voteAverageGte** | **BigDecimal**| Filter and only include movies that have a rating that is greater or equal to the specified value. | [optional]
 **voteCountGte** | **Integer**| Filter and only include movies that have a rating that is less than or equal to the specified value. | [optional]
 **withGenres** | **String**| Comma separated value of genre ids that you want to include in the results. | [optional]
 **withNetworks** | **String**| Comma separated value of network ids that you want to include in the results. | [optional]
 **withoutGenres** | **String**| Comma separated value of genre ids that you want to exclude from the results. | [optional]
 **withRuntimeGte** | **Integer**| Filter and only include TV shows with an episode runtime that is greater than or equal to a value. | [optional]
 **withRuntimeLte** | **Integer**| Filter and only include TV shows with an episode runtime that is less than or equal to a value. | [optional]
 **includeNullFirstAirDates** | **Boolean**| Use this filter to include TV shows that don&#39;t have an air date while using any of the \&quot;first_air_date\&quot; filters. | [optional] [default to false]
 **withOriginalLanguage** | **String**| Specify an ISO 639-1 string to filter results by their original language value. | [optional]
 **withoutKeywords** | **String**| Exclude items with certain keywords. You can comma and pipe seperate these values to create an &#39;AND&#39; or &#39;OR&#39; logic. | [optional]
 **screenedTheatrically** | **Boolean**| Filter results to include items that have been screened theatrically. | [optional]
 **withCompanies** | **String**| A comma separated list of production company ID&#39;s. Only include movies that have one of the ID&#39;s added as a production company. | [optional]
 **withKeywords** | **String**| A comma separated list of keyword ID&#39;s. Only includes TV shows that have one of the ID&#39;s added as a keyword. | [optional]
 **withWatchProviders** | **String**| A comma or pipe separated list of watch provider ID&#39;s. Combine this filter with &#x60;watch_region&#x60; in order to filter your results by a specific watch provider in a specific region. | [optional]
 **watchRegion** | **String**| An ISO 3166-1 code. Combine this filter with &#x60;with_watch_providers&#x60; in order to filter your results by a specific watch provider in a specific region. | [optional]
 **withWatchMonetizationTypes** | **String**| In combination with &#x60;watch_region&#x60;, you can filter by monetization type. | [optional] [enum: flatrate, free, ads, rent, buy]
 **withStatus** | **String**| Filter TV shows by their status.  Returning Series: 0 Planned: 1 In Production: 2 Ended: 3 Cancelled: 4 Pilot: 5 | [optional] [enum: 0, 1, 2, 3, 4, 5]
 **withType** | **String**| Filter TV shows by their type.  Documentary: 0 News: 1 Miniseries: 2 Reality: 3 Scripted: 4 Talk Show: 5 Video: 6 | [optional] [enum: 0, 1, 2, 3, 4, 5, 6]
 **withoutCompanies** | **String**| Filter the results to exclude the specific production companies you specify here. &#x60;AND&#x60; / &#x60;OR&#x60; filters are supported. | [optional]

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETFindExternalId"></a>
# **gETFindExternalId**
> InlineResponse20032 gETFindExternalId(externalId, externalSource)

Find by ID

The find method makes it easy to search for objects in our database by an external id.  This method will search all objects (movies, TV shows and people) and return the results in a single response.  The supported external sources for each object are as follows.  #### Media Databases  |              | Movies | TV Shows | TV Seasons | TV Episodes | People | | ------------ | ------ | -------- | ---------- | ----------- | ------ | | IMDb ID      | ✓      | ✓        | ✗          | ✓           | ✓      | | TVDB ID      | ✗      | ✓        | ✓          | ✓           | ✗      | | Freebase MID*| ✗      | ✓        | ✓          | ✓           | ✓      | | Freebase ID* | ✗      | ✓        | ✓          | ✓           | ✓      | | TVRage ID*   | ✗      | ✓        | ✓          | ✓           | ✓      |  #### Social IDs  |              | Movies | TV Shows | TV Seasons | TV Episodes | People | | ------------ | ------ | -------- | ---------- | ----------- | ------ | | Facebook     | ✓      | ✓        | ✗          | ✗           | ✓      | | Instagram    | ✓      | ✓        | ✗          | ✗           | ✓      | | Twitter      | ✓      | ✓        | ✗          | ✗           | ✓      |  *Defunct or no longer available as a service.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String externalId = "externalId_example"; // String | 
String externalSource = "externalSource_example"; // String | 
try {
    InlineResponse20032 result = apiInstance.gETFindExternalId(externalId, externalSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETFindExternalId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**|  |
 **externalSource** | **String**|  | [enum: imdb_id, freebase_mid, freebase_id, tvdb_id, tvrage_id, facebook_id, twitter_id, instagram_id]

### Return type

[**InlineResponse20032**](InlineResponse20032.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETGenreMovieList"></a>
# **gETGenreMovieList**
> InlineResponse20036 gETGenreMovieList(language)

Get Movie List

Get the list of official genres for movies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String language = "language_example"; // String | 
try {
    InlineResponse20036 result = apiInstance.gETGenreMovieList(language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETGenreMovieList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**|  | [optional]

### Return type

[**InlineResponse20036**](InlineResponse20036.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETGenreTvList"></a>
# **gETGenreTvList**
> InlineResponse20036 gETGenreTvList()

Get TV List

Get the list of official genres for TV shows.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20036 result = apiInstance.gETGenreTvList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETGenreTvList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20036**](InlineResponse20036.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETGuestSessionGuestSessionIdRatedMovies"></a>
# **gETGuestSessionGuestSessionIdRatedMovies**
> InlineResponse20026 gETGuestSessionGuestSessionIdRatedMovies(guestSessionId)

Get Rated Movies

Get the rated movies for a guest session.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String guestSessionId = "guestSessionId_example"; // String | 
try {
    InlineResponse20026 result = apiInstance.gETGuestSessionGuestSessionIdRatedMovies(guestSessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETGuestSessionGuestSessionIdRatedMovies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guestSessionId** | **String**|  |

### Return type

[**InlineResponse20026**](InlineResponse20026.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETGuestSessionGuestSessionIdRatedTv"></a>
# **gETGuestSessionGuestSessionIdRatedTv**
> InlineResponse20062 gETGuestSessionGuestSessionIdRatedTv(guestSessionId)

Get Rated TV Shows

Get the rated TV shows for a guest session.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String guestSessionId = "guestSessionId_example"; // String | 
try {
    InlineResponse20062 result = apiInstance.gETGuestSessionGuestSessionIdRatedTv(guestSessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETGuestSessionGuestSessionIdRatedTv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guestSessionId** | **String**|  |

### Return type

[**InlineResponse20062**](InlineResponse20062.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETGuestSessionGuestSessionIdRatedTvEpisodes"></a>
# **gETGuestSessionGuestSessionIdRatedTvEpisodes**
> InlineResponse20018 gETGuestSessionGuestSessionIdRatedTvEpisodes(guestSessionId)

Get Rated TV Episodes

Get the rated TV episodes for a guest session.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String guestSessionId = "guestSessionId_example"; // String | 
try {
    InlineResponse20018 result = apiInstance.gETGuestSessionGuestSessionIdRatedTvEpisodes(guestSessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETGuestSessionGuestSessionIdRatedTvEpisodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guestSessionId** | **String**|  |

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETKeywordKeywordId"></a>
# **gETKeywordKeywordId**
> InlineResponse2009Results gETKeywordKeywordId(keywordId)

Get Details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer keywordId = 56; // Integer | 
try {
    InlineResponse2009Results result = apiInstance.gETKeywordKeywordId(keywordId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETKeywordKeywordId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keywordId** | **Integer**|  |

### Return type

[**InlineResponse2009Results**](InlineResponse2009Results.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETKeywordKeywordIdMovies"></a>
# **gETKeywordKeywordIdMovies**
> InlineResponse20040 gETKeywordKeywordIdMovies(keywordId)

Get Movies

Get the movies that belong to a keyword.  We **highly recommend** using [movie discover](#endpoint:p5NyoR7dM842S8G9j) instead of this method as it is much more flexible.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer keywordId = 56; // Integer | 
try {
    InlineResponse20040 result = apiInstance.gETKeywordKeywordIdMovies(keywordId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETKeywordKeywordIdMovies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keywordId** | **Integer**|  |

### Return type

[**InlineResponse20040**](InlineResponse20040.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETListListId"></a>
# **gETListListId**
> InlineResponse20031 gETListListId(listId)

Get Details

Get the details of a list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String listId = "listId_example"; // String | 
try {
    InlineResponse20031 result = apiInstance.gETListListId(listId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETListListId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **String**|  |

### Return type

[**InlineResponse20031**](InlineResponse20031.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETListListIdItemStatus"></a>
# **gETListListIdItemStatus**
> InlineResponse20071 gETListListIdItemStatus(listId, movieId)

Check Item Status

You can use this method to check if a movie has already been added to the list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String listId = "listId_example"; // String | 
Integer movieId = 56; // Integer | 
try {
    InlineResponse20071 result = apiInstance.gETListListIdItemStatus(listId, movieId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETListListIdItemStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **String**|  |
 **movieId** | **Integer**|  |

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieChanges"></a>
# **gETMovieChanges**
> InlineResponse20039 gETMovieChanges()

Get Movie Change List

Get  a list of all of the movie ids that have been changed in the past 24 hours.  You can query it for up to 14 days worth of changed IDs at a time with the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters. 100 items are returned per page.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20039 result = apiInstance.gETMovieChanges();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieChanges");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20039**](InlineResponse20039.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieLatest"></a>
# **gETMovieLatest**
> InlineResponse20077 gETMovieLatest()

Get Latest

Get the most newly created movie. This is a live response and will continuously change.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20077 result = apiInstance.gETMovieLatest();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieLatest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20077**](InlineResponse20077.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieId"></a>
# **gETMovieMovieId**
> InlineResponse20043 gETMovieMovieId(movieId)

Get Details

Get the primary information about a movie.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).  #### Recent Changes  | **Date** | **Change** | | - | - | | November 20, 2020 | A &#x60;watch/providers&#x60; method has been added to show what providers (eg. streaming) are available and where.|

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
try {
    InlineResponse20043 result = apiInstance.gETMovieMovieId(movieId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |

### Return type

[**InlineResponse20043**](InlineResponse20043.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdAccountStates"></a>
# **gETMovieMovieIdAccountStates**
> InlineResponse20048 gETMovieMovieIdAccountStates(movieId, sessionId, guestSessionId)

Get Account States

Grab the following account states for a session:  - Movie rating - If it belongs to your watchlist - If it belongs to your favourite list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String sessionId = "sessionId_example"; // String | 
String guestSessionId = "guestSessionId_example"; // String | 
try {
    InlineResponse20048 result = apiInstance.gETMovieMovieIdAccountStates(movieId, sessionId, guestSessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdAccountStates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **sessionId** | **String**|  | [optional]
 **guestSessionId** | **String**|  | [optional]

### Return type

[**InlineResponse20048**](InlineResponse20048.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdAlternativeTitles"></a>
# **gETMovieMovieIdAlternativeTitles**
> InlineResponse20078 gETMovieMovieIdAlternativeTitles(movieId, country)

Get Alternative Titles

Get all of the alternative titles for a movie.  #### Recent Changes  | **Date** | **Change** | | - | - | | March 16, 2018 | Added the &#x60;type&#x60; field. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String country = "country_example"; // String | 
try {
    InlineResponse20078 result = apiInstance.gETMovieMovieIdAlternativeTitles(movieId, country);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdAlternativeTitles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **country** | **String**|  | [optional]

### Return type

[**InlineResponse20078**](InlineResponse20078.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdChanges"></a>
# **gETMovieMovieIdChanges**
> InlineResponse20068 gETMovieMovieIdChanges(movieId)

Get Changes

Get the changes for a movie. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
try {
    InlineResponse20068 result = apiInstance.gETMovieMovieIdChanges(movieId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |

### Return type

[**InlineResponse20068**](InlineResponse20068.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdCredits"></a>
# **gETMovieMovieIdCredits**
> InlineResponse20038 gETMovieMovieIdCredits(movieId)

Get Credits

Get the cast and crew for a movie.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
try {
    InlineResponse20038 result = apiInstance.gETMovieMovieIdCredits(movieId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdCredits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |

### Return type

[**InlineResponse20038**](InlineResponse20038.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdExternalIds"></a>
# **gETMovieMovieIdExternalIds**
> InlineResponse20012 gETMovieMovieIdExternalIds(movieId, apiKey)

Get External IDs

Get the external ids for a movie. We currently support the following external sources.  | **Media Databases** | **Social IDs** | | ------------------- | -------------- | | IMDb ID             | Facebook       | |                     | Instagram      | |                     | Twitter        |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse20012 result = apiInstance.gETMovieMovieIdExternalIds(movieId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdExternalIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **apiKey** | **String**|  | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdImages"></a>
# **gETMovieMovieIdImages**
> InlineResponse2004 gETMovieMovieIdImages(movieId, includeImageLanguage)

Get Images

Get the images that belong to a movie.  Querying images with a &#x60;language&#x60; parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the &#x60;include_image_language&#x60; parameter. This should be a comma seperated value like so: &#x60;include_image_language&#x3D;en,null&#x60;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String includeImageLanguage = "includeImageLanguage_example"; // String | 
try {
    InlineResponse2004 result = apiInstance.gETMovieMovieIdImages(movieId, includeImageLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **includeImageLanguage** | **String**|  | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdKeywords"></a>
# **gETMovieMovieIdKeywords**
> InlineResponse20056 gETMovieMovieIdKeywords(movieId, apiKey)

Get Keywords

Get the keywords that have been added to a movie.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse20056 result = apiInstance.gETMovieMovieIdKeywords(movieId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdKeywords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **apiKey** | **String**|  | [optional]

### Return type

[**InlineResponse20056**](InlineResponse20056.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdLists"></a>
# **gETMovieMovieIdLists**
> InlineResponse2007 gETMovieMovieIdLists(movieId, apiKey)

Get Lists

Get a list of lists that this movie belongs to.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse2007 result = apiInstance.gETMovieMovieIdLists(movieId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **apiKey** | **String**|  | [optional]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdRecommendations"></a>
# **gETMovieMovieIdRecommendations**
> InlineResponse2002 gETMovieMovieIdRecommendations(movieId, apiKey)

Get Recommendations

Get a list of recommended movies for a movie.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse2002 result = apiInstance.gETMovieMovieIdRecommendations(movieId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdRecommendations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **apiKey** | **String**|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdReleaseDates"></a>
# **gETMovieMovieIdReleaseDates**
> InlineResponse20075 gETMovieMovieIdReleaseDates(movieId, apiKey)

Get Release Dates

Get the release date along with the certification for a movie.  Release dates support different types:  1. Premiere 2. Theatrical (limited) 3. Theatrical 4. Digital 5. Physical 6. TV

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse20075 result = apiInstance.gETMovieMovieIdReleaseDates(movieId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdReleaseDates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **apiKey** | **String**|  | [optional]

### Return type

[**InlineResponse20075**](InlineResponse20075.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdReviews"></a>
# **gETMovieMovieIdReviews**
> InlineResponse20042 gETMovieMovieIdReviews(movieId, apiKey)

Get Reviews

Get the user reviews for a movie.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse20042 result = apiInstance.gETMovieMovieIdReviews(movieId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdReviews");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **apiKey** | **String**|  | [optional]

### Return type

[**InlineResponse20042**](InlineResponse20042.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdSimilar"></a>
# **gETMovieMovieIdSimilar**
> InlineResponse2002 gETMovieMovieIdSimilar(movieId, apiKey)

Get Similar Movies

Get a list of similar movies. This is **not** the same as the \&quot;Recommendation\&quot; system you see on the website.  These items are assembled by looking at keywords and genres.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse2002 result = apiInstance.gETMovieMovieIdSimilar(movieId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdSimilar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **apiKey** | **String**|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdTranslations"></a>
# **gETMovieMovieIdTranslations**
> InlineResponse20013 gETMovieMovieIdTranslations(movieId, apiKey)

Get Translations

Get a list of translations that have been created for a movie.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse20013 result = apiInstance.gETMovieMovieIdTranslations(movieId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdTranslations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **apiKey** | **String**|  | [optional]

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdVideos"></a>
# **gETMovieMovieIdVideos**
> InlineResponse20022 gETMovieMovieIdVideos(movieId, apiKey)

Get Videos

Get the videos that have been added to a movie.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 28, 2021 | A new &#x60;include_video_language&#x60; filter is now available. You can use this filter the same way you use &#x60;include_image_language&#x60; on image calls. We also added two new fields, &#x60;official&#x60; and &#x60;published_at&#x60; to the video response. | | March 23, 2019 | Vimeo was added as a video source. | | March 20, 2019 | \&quot;Behind the Scenes\&quot; and \&quot;Bloopers\&quot; were added as valid video types. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse20022 result = apiInstance.gETMovieMovieIdVideos(movieId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdVideos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **apiKey** | **String**|  | [optional]

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieMovieIdWatchProviders"></a>
# **gETMovieMovieIdWatchProviders**
> InlineResponse20087 gETMovieMovieIdWatchProviders(movieId, apiKey)

Get Watch Providers

Powered by our partnership with JustWatch, you can query this method to get a list of the availabilities per country by provider.  This is **not** going to return full deep links, but rather, it&#39;s just enough information to display what&#39;s available where.  You can link to the provided TMDB URL to help support TMDB and provide the actual deep links to the content.  **Please note**: In order to use this data **you must** attribute the source of the data as JustWatch. If we find any usage not complying with these terms we will revoke access to the API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse20087 result = apiInstance.gETMovieMovieIdWatchProviders(movieId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieMovieIdWatchProviders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **apiKey** | **String**|  | [optional]

### Return type

[**InlineResponse20087**](InlineResponse20087.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieNowPlaying"></a>
# **gETMovieNowPlaying**
> InlineResponse20057 gETMovieNowPlaying()

Get Now Playing

Get a list of movies in theatres. This is a release type query that looks for all movies that have a release type of 2 or 3 within the specified date range.  You can optionally specify a &#x60;region&#x60; prameter which will narrow the search to only look for theatrical release dates within the specified country.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20057 result = apiInstance.gETMovieNowPlaying();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieNowPlaying");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20057**](InlineResponse20057.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMoviePopular"></a>
# **gETMoviePopular**
> InlineResponse200 gETMoviePopular()

Get Popular

Get a list of the current popular movies on TMDB. This list updates daily.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse200 result = apiInstance.gETMoviePopular();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMoviePopular");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieTopRated"></a>
# **gETMovieTopRated**
> InlineResponse200 gETMovieTopRated()

Get Top Rated

Get the top rated movies on TMDB.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse200 result = apiInstance.gETMovieTopRated();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieTopRated");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETMovieUpcoming"></a>
# **gETMovieUpcoming**
> InlineResponse20063 gETMovieUpcoming()

Get Upcoming

Get a list of upcoming movies in theatres. This is a release type query that looks for all movies that have a release type of 2 or 3 within the specified date range.  You can optionally specify a &#x60;region&#x60; prameter which will narrow the search to only look for theatrical release dates within the specified country.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20063 result = apiInstance.gETMovieUpcoming();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETMovieUpcoming");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20063**](InlineResponse20063.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETNetworkNetworkId"></a>
# **gETNetworkNetworkId**
> InlineResponse20080 gETNetworkNetworkId(networkId)

Get Details

Get the details of a network.  #### Recent Changes  | **Date** | **Change** | | - | - | | November 14, 2020 | The &#x60;logo_path&#x60; has been added to the default response. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer networkId = 56; // Integer | 
try {
    InlineResponse20080 result = apiInstance.gETNetworkNetworkId(networkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETNetworkNetworkId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**|  |

### Return type

[**InlineResponse20080**](InlineResponse20080.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETNetworkNetworkIdAlternativeNames"></a>
# **gETNetworkNetworkIdAlternativeNames**
> InlineResponse20058 gETNetworkNetworkIdAlternativeNames(networkId)

Get Alternative Names

Get the alternative names of a network.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer networkId = 56; // Integer | 
try {
    InlineResponse20058 result = apiInstance.gETNetworkNetworkIdAlternativeNames(networkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETNetworkNetworkIdAlternativeNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**|  |

### Return type

[**InlineResponse20058**](InlineResponse20058.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETNetworkNetworkIdImages"></a>
# **gETNetworkNetworkIdImages**
> InlineResponse20023 gETNetworkNetworkIdImages(networkId)

Get Images

Get the TV network logos by id.  There are two image formats that are supported for networks, PNG&#39;s and SVG&#39;s. You can see which type the original file is by looking at the &#x60;file_type&#x60; field. We prefer SVG&#39;s as they are resolution independent and as such, the width and height are only there to reflect the original asset that was uploaded. An SVG can be scaled properly beyond those dimensions if you call them as a PNG.  For more information about how SVG&#39;s and PNG&#39;s can be used, take a read through [this document](#docTextSection:mXP9B2uzoDJFguDZv).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer networkId = 56; // Integer | 
try {
    InlineResponse20023 result = apiInstance.gETNetworkNetworkIdImages(networkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETNetworkNetworkIdImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **Integer**|  |

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonChanges"></a>
# **gETPersonChanges**
> InlineResponse20039 gETPersonChanges()

Get Person Change List

Get a list of all of the person ids that have been changed in the past 24 hours.  You can query it for up to 14 days worth of changed IDs at a time with the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters. 100 items are returned per page.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20039 result = apiInstance.gETPersonChanges();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonChanges");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20039**](InlineResponse20039.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonLatest"></a>
# **gETPersonLatest**
> InlineResponse20070 gETPersonLatest()

Get Latest

Get the most newly created person. This is a live response and will continuously change.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20070 result = apiInstance.gETPersonLatest();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonLatest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20070**](InlineResponse20070.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonPersonId"></a>
# **gETPersonPersonId**
> InlineResponse20028 gETPersonPersonId(personId)

Get Details

Get the primary person details by id.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).  #### Recent Changes  | **Date** | **Change** | | - | - | | July 17, 2018 | Added the &#x60;known_for_department&#x60; field. | | April 26, 2018 | Added the [translations](#endpoint:CSaMjCxXAtGpxNGfS) method. | | November 9, 2016 | Biographies are now translatable on TMDB. This means you can query person details with a language parameter. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer personId = 56; // Integer | 
try {
    InlineResponse20028 result = apiInstance.gETPersonPersonId(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonPersonId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Integer**|  |

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonPersonIdChanges"></a>
# **gETPersonPersonIdChanges**
> InlineResponse2003 gETPersonPersonIdChanges(personId)

Get Changes

Get the changes for a person. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer personId = 56; // Integer | 
try {
    InlineResponse2003 result = apiInstance.gETPersonPersonIdChanges(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonPersonIdChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Integer**|  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonPersonIdCombinedCredits"></a>
# **gETPersonPersonIdCombinedCredits**
> InlineResponse20014 gETPersonPersonIdCombinedCredits(personId)

Get Combined Credits

Get the movie and TV credits together in a single response.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer personId = 56; // Integer | 
try {
    InlineResponse20014 result = apiInstance.gETPersonPersonIdCombinedCredits(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonPersonIdCombinedCredits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Integer**|  |

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonPersonIdExternalIds"></a>
# **gETPersonPersonIdExternalIds**
> InlineResponse20089 gETPersonPersonIdExternalIds(personId)

Get External IDs

Get the external ids for a person. We currently support the following external sources.  | **External Sources** | | ------------     | | IMDB ID          | | Facebook         | | Freebase MID     | | Freebase ID      | | Instagram        | | TVRage ID        | | Twitter          |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer personId = 56; // Integer | 
try {
    InlineResponse20089 result = apiInstance.gETPersonPersonIdExternalIds(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonPersonIdExternalIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Integer**|  |

### Return type

[**InlineResponse20089**](InlineResponse20089.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonPersonIdImages"></a>
# **gETPersonPersonIdImages**
> InlineResponse20086 gETPersonPersonIdImages(personId)

Get Images

Get the images for a person.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer personId = 56; // Integer | 
try {
    InlineResponse20086 result = apiInstance.gETPersonPersonIdImages(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonPersonIdImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Integer**|  |

### Return type

[**InlineResponse20086**](InlineResponse20086.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonPersonIdMovieCredits"></a>
# **gETPersonPersonIdMovieCredits**
> InlineResponse20027 gETPersonPersonIdMovieCredits(personId)

Get Movie Credits

Get the movie credits for a person.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer personId = 56; // Integer | 
try {
    InlineResponse20027 result = apiInstance.gETPersonPersonIdMovieCredits(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonPersonIdMovieCredits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Integer**|  |

### Return type

[**InlineResponse20027**](InlineResponse20027.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonPersonIdTaggedImages"></a>
# **gETPersonPersonIdTaggedImages**
> InlineResponse20051 gETPersonPersonIdTaggedImages(personId)

Get Tagged Images

Get the images that this person has been tagged in.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer personId = 56; // Integer | 
try {
    InlineResponse20051 result = apiInstance.gETPersonPersonIdTaggedImages(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonPersonIdTaggedImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Integer**|  |

### Return type

[**InlineResponse20051**](InlineResponse20051.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonPersonIdTranslations"></a>
# **gETPersonPersonIdTranslations**
> InlineResponse20067 gETPersonPersonIdTranslations(personId)

Get Translations

Get a list of translations that have been created for a person.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer personId = 56; // Integer | 
try {
    InlineResponse20067 result = apiInstance.gETPersonPersonIdTranslations(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonPersonIdTranslations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Integer**|  |

### Return type

[**InlineResponse20067**](InlineResponse20067.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonPersonIdTvCredits"></a>
# **gETPersonPersonIdTvCredits**
> InlineResponse20064 gETPersonPersonIdTvCredits(personId)

Get TV Credits

Get the TV show credits for a person.  You can query for some extra details about the credit with the [credit method](#endpoint:xPWdEBLkvCNZSicLN).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer personId = 56; // Integer | 
try {
    InlineResponse20064 result = apiInstance.gETPersonPersonIdTvCredits(personId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonPersonIdTvCredits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **Integer**|  |

### Return type

[**InlineResponse20064**](InlineResponse20064.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPersonPopular"></a>
# **gETPersonPopular**
> InlineResponse20010 gETPersonPopular()

Get Popular

Get the list of popular people on TMDB. This list updates daily.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20010 result = apiInstance.gETPersonPopular();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPersonPopular");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETReviewReviewId"></a>
# **gETReviewReviewId**
> InlineResponse20021 gETReviewReviewId(reviewId)

Get Details

Retrieve the details of a movie or TV show review.  #### Recent Changes  | **Date** | **Change** | | - | - | | November 14, 2020 | A &#x60;author_details&#x60; field has been added to the default response, which includes an &#x60;avatar_path&#x60; and &#x60;rating&#x60; value. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String reviewId = "reviewId_example"; // String | 
try {
    InlineResponse20021 result = apiInstance.gETReviewReviewId(reviewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETReviewReviewId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reviewId** | **String**|  |

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETSearchCollection"></a>
# **gETSearchCollection**
> InlineResponse20047 gETSearchCollection()

Search Collections

Search for collections.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20047 result = apiInstance.gETSearchCollection();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETSearchCollection");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20047**](InlineResponse20047.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETSearchCompany"></a>
# **gETSearchCompany**
> InlineResponse2009 gETSearchCompany()

Search Companies

Search for companies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse2009 result = apiInstance.gETSearchCompany();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETSearchCompany");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETSearchKeyword"></a>
# **gETSearchKeyword**
> InlineResponse2009 gETSearchKeyword()

Search Keywords

Search for keywords.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse2009 result = apiInstance.gETSearchKeyword();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETSearchKeyword");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETSearchMovie"></a>
# **gETSearchMovie**
> InlineResponse200 gETSearchMovie(year, primaryReleaseYear)

Search Movies

Search for movies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer year = 56; // Integer | 
Integer primaryReleaseYear = 56; // Integer | 
try {
    InlineResponse200 result = apiInstance.gETSearchMovie(year, primaryReleaseYear);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETSearchMovie");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **Integer**|  | [optional]
 **primaryReleaseYear** | **Integer**|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETSearchMulti"></a>
# **gETSearchMulti**
> InlineResponse20037 gETSearchMulti()

Multi Search

Search multiple models in a single request. Multi search currently supports searching for movies, tv shows and people in a single request.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20037 result = apiInstance.gETSearchMulti();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETSearchMulti");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20037**](InlineResponse20037.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETSearchPerson"></a>
# **gETSearchPerson**
> InlineResponse20029 gETSearchPerson()

Search People

Search for people.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20029 result = apiInstance.gETSearchPerson();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETSearchPerson");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20029**](InlineResponse20029.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETSearchTv"></a>
# **gETSearchTv**
> InlineResponse20030 gETSearchTv(firstAirDateYear)

Search TV Shows

Search for a TV show.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer firstAirDateYear = 56; // Integer | 
try {
    InlineResponse20030 result = apiInstance.gETSearchTv(firstAirDateYear);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETSearchTv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstAirDateYear** | **Integer**|  | [optional]

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvAiringToday"></a>
# **gETTvAiringToday**
> InlineResponse20030 gETTvAiringToday()

Get TV Airing Today

Get a list of TV shows that are airing today. This query is purely day based as we do not currently support airing times.  You can specify a [timezone](endpoint:KQ4CDdEoWKJYLkrhS) to offset the day calculation. Without a specified timezone, this query defaults to EST (Eastern Time UTC-05:00).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20030 result = apiInstance.gETTvAiringToday();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvAiringToday");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvChanges"></a>
# **gETTvChanges**
> InlineResponse20039 gETTvChanges()

Get TV Change List

Get a list of all of the TV show ids that have been changed in the past 24 hours.  You can query it for up to 14 days worth of changed IDs at a time with the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters. 100 items are returned per page.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20039 result = apiInstance.gETTvChanges();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvChanges");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20039**](InlineResponse20039.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvEpisodeEpisodeIdChanges"></a>
# **gETTvEpisodeEpisodeIdChanges**
> InlineResponse20085 gETTvEpisodeEpisodeIdChanges(episodeId)

Get Changes

Get the changes for a TV episode. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer episodeId = 56; // Integer | 
try {
    InlineResponse20085 result = apiInstance.gETTvEpisodeEpisodeIdChanges(episodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvEpisodeEpisodeIdChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **episodeId** | **Integer**|  |

### Return type

[**InlineResponse20085**](InlineResponse20085.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvEpisodeGroupId"></a>
# **gETTvEpisodeGroupId**
> InlineResponse20052 gETTvEpisodeGroupId(id)

Get Details

Get the details of a TV episode group. Groups support 7 different types which are enumerated as the following:  1. Original air date 2. Absolute 3. DVD 4. Digital 5. Story arc 6. Production 7. TV

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    InlineResponse20052 result = apiInstance.gETTvEpisodeGroupId(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvEpisodeGroupId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**InlineResponse20052**](InlineResponse20052.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvLatest"></a>
# **gETTvLatest**
> InlineResponse20059 gETTvLatest()

Get Latest

Get the most newly created TV show. This is a live response and will continuously change.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20059 result = apiInstance.gETTvLatest();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvLatest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20059**](InlineResponse20059.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvOnTheAir"></a>
# **gETTvOnTheAir**
> InlineResponse20030 gETTvOnTheAir()

Get TV On The Air

Get a list of shows that are currently on the air.  This query looks for any TV show that has an episode with an air date in the next 7 days.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20030 result = apiInstance.gETTvOnTheAir();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvOnTheAir");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvPopular"></a>
# **gETTvPopular**
> InlineResponse20030 gETTvPopular()

Get Popular

Get a list of the current popular TV shows on TMDB. This list updates daily.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20030 result = apiInstance.gETTvPopular();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvPopular");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvSeasonSeasonIdChanges"></a>
# **gETTvSeasonSeasonIdChanges**
> InlineResponse20069 gETTvSeasonSeasonIdChanges(seasonId)

Get  Changes

Get the changes for a TV season. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer seasonId = 56; // Integer | 
try {
    InlineResponse20069 result = apiInstance.gETTvSeasonSeasonIdChanges(seasonId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvSeasonSeasonIdChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **seasonId** | **Integer**|  |

### Return type

[**InlineResponse20069**](InlineResponse20069.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTopRated"></a>
# **gETTvTopRated**
> InlineResponse20030 gETTvTopRated()

Get Top Rated

Get a list of the top rated TV shows on TMDB.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20030 result = apiInstance.gETTvTopRated();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTopRated");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvId"></a>
# **gETTvTvId**
> InlineResponse20061 gETTvTvId(tvId)

Get Details

Get the primary TV show details by id.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).  #### Recent Changes  | **Date** | **Change** | | - | - | | November 20, 2020 | A &#x60;watch/providers&#x60; method has been added to show what providers (eg. streaming) are available and where.| | November 14, 2020 | The &#x60;tagline&#x60; has been added to the default response, and is also available as part of the translations method. | | July 17, 2018 | We now return &#x60;last_episode_to_air&#x60; and &#x60;next_episode_to_air&#x60; fields. | | March 12, 2018 | Networks return proper logos and we introduced SVG support. | | March 8, 2018 | The &#x60;seasons&#x60; field now returns the translated names and overviews. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    InlineResponse20061 result = apiInstance.gETTvTvId(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

[**InlineResponse20061**](InlineResponse20061.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdAccountStates"></a>
# **gETTvTvIdAccountStates**
> InlineResponse20048 gETTvTvIdAccountStates(tvId, guestSessionId, sessionId)

Get Account States

Grab the following account states for a session:  - TV show rating - If it belongs to your watchlist - If it belongs to your favourite list

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
String guestSessionId = "guestSessionId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    InlineResponse20048 result = apiInstance.gETTvTvIdAccountStates(tvId, guestSessionId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdAccountStates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **guestSessionId** | **String**|  | [optional]
 **sessionId** | **String**|  | [optional]

### Return type

[**InlineResponse20048**](InlineResponse20048.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdAlternativeTitles"></a>
# **gETTvTvIdAlternativeTitles**
> InlineResponse20066 gETTvTvIdAlternativeTitles(tvId)

Get Alternative Titles

Returns all of the alternative titles for a TV show.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    InlineResponse20066 result = apiInstance.gETTvTvIdAlternativeTitles(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdAlternativeTitles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

[**InlineResponse20066**](InlineResponse20066.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdChanges"></a>
# **gETTvTvIdChanges**
> InlineResponse20033 gETTvTvIdChanges(tvId)

Get Changes

Get the changes for a TV show. By default only the last 24 hours are returned.  You can query up to 14 days in a single query by using the &#x60;start_date&#x60; and &#x60;end_date&#x60; query parameters.  TV show changes are different than movie changes in that there are some edits on seasons and episodes that will create a change entry at the show level. These can be found under the season and episode keys. These keys will contain a &#x60;series_id&#x60; and &#x60;episode_id&#x60;. You can use the [season changes](#endpoint:ZqhtyQbJ4YXz8RSya) and [episode changes](#endpoint:FpqrhBzgf2RJv4bHC) methods to look these up individually.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    InlineResponse20033 result = apiInstance.gETTvTvIdChanges(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

[**InlineResponse20033**](InlineResponse20033.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdContentRatings"></a>
# **gETTvTvIdContentRatings**
> InlineResponse20019 gETTvTvIdContentRatings(tvId)

Get Content Ratings

Get the list of content ratings (certifications) that have been added to a TV show.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    InlineResponse20019 result = apiInstance.gETTvTvIdContentRatings(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdContentRatings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdEpisodeGroups"></a>
# **gETTvTvIdEpisodeGroups**
> InlineResponse20046 gETTvTvIdEpisodeGroups(tvId)

Get Episode Groups

Get all of the episode groups that have been created for a TV show. With a group ID you can call the [get TV episode group details](#endpoint:yCouThc88qs7DGHY5) method.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    InlineResponse20046 result = apiInstance.gETTvTvIdEpisodeGroups(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdEpisodeGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdExternalIds"></a>
# **gETTvTvIdExternalIds**
> InlineResponse20012 gETTvTvIdExternalIds(tvId)

Get External IDs

Get the external ids for a TV show. We currently support the following external sources.  | **Media Databases** | **Social IDs** | | ------------------- | -------------- | | IMDb ID             | Facebook       | | TVDB ID             | Instagram      | | Freebase MID*       | Twitter        | | Freebase ID*        |                | | TVRage ID*          |                |  *Defunct or no longer available as a service.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    InlineResponse20012 result = apiInstance.gETTvTvIdExternalIds(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdExternalIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdImages"></a>
# **gETTvTvIdImages**
> InlineResponse20024 gETTvTvIdImages(tvId)

Get Images

Get the images that belong to a TV show.  Querying images with a &#x60;language&#x60; parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the &#x60;include_image_language&#x60; parameter. This should be a comma seperated value like so: &#x60;include_image_language&#x3D;en,null&#x60;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    InlineResponse20024 result = apiInstance.gETTvTvIdImages(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

[**InlineResponse20024**](InlineResponse20024.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdKeywords"></a>
# **gETTvTvIdKeywords**
> InlineResponse20079 gETTvTvIdKeywords(tvId)

Get Keywords

Get the keywords that have been added to a TV show.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    InlineResponse20079 result = apiInstance.gETTvTvIdKeywords(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdKeywords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

[**InlineResponse20079**](InlineResponse20079.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdRecommendations"></a>
# **gETTvTvIdRecommendations**
> InlineResponse20011 gETTvTvIdRecommendations(tvId)

Get Recommendations

Get the list of TV show recommendations for this item.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    InlineResponse20011 result = apiInstance.gETTvTvIdRecommendations(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdRecommendations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdReviews"></a>
# **gETTvTvIdReviews**
> InlineResponse20082 gETTvTvIdReviews(tvId)

Get Reviews

Get the reviews for a TV show.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    InlineResponse20082 result = apiInstance.gETTvTvIdReviews(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdReviews");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

[**InlineResponse20082**](InlineResponse20082.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdScreenedTheatrically"></a>
# **gETTvTvIdScreenedTheatrically**
> InlineResponse20083 gETTvTvIdScreenedTheatrically(tvId)

Get Screened Theatrically

Get a list of seasons or episodes that have been screened in a film festival or theatre.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    InlineResponse20083 result = apiInstance.gETTvTvIdScreenedTheatrically(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdScreenedTheatrically");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

[**InlineResponse20083**](InlineResponse20083.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberAccountStates"></a>
# **gETTvTvIdSeasonSeasonNumberAccountStates**
> InlineResponse20055 gETTvTvIdSeasonSeasonNumberAccountStates(tvId, seasonNumber, guestSessionId, sessionId)

Get Account States

Returns all of the user ratings for the season&#39;s episodes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
String guestSessionId = "guestSessionId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    InlineResponse20055 result = apiInstance.gETTvTvIdSeasonSeasonNumberAccountStates(tvId, seasonNumber, guestSessionId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberAccountStates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |
 **guestSessionId** | **String**|  | [optional]
 **sessionId** | **String**|  | [optional]

### Return type

[**InlineResponse20055**](InlineResponse20055.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberCredits"></a>
# **gETTvTvIdSeasonSeasonNumberCredits**
> InlineResponse20034 gETTvTvIdSeasonSeasonNumberCredits(tvId, seasonNumber)

Get Credits

Get the credits for TV season.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
try {
    InlineResponse20034 result = apiInstance.gETTvTvIdSeasonSeasonNumberCredits(tvId, seasonNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberCredits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |

### Return type

[**InlineResponse20034**](InlineResponse20034.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber"></a>
# **gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber**
> InlineResponse20017 gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber(tvId, seasonNumber, episodeNumber)

Get Details

Get the TV episode details by id.  Supports &#x60;append_to_response&#x60;. Read more about this [here](#docTextSection:JdZq8ctmcxNqyLQjp).  #### Recent Changes  | **Date** | **Change** | | - | - | | June 1, 2018 | Added the [translations](#endpoint:5SFwZar3LkP99QMp7) method. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
Integer episodeNumber = 56; // Integer | 
try {
    InlineResponse20017 result = apiInstance.gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber(tvId, seasonNumber, episodeNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |
 **episodeNumber** | **Integer**|  |

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates"></a>
# **gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates**
> InlineResponse20012 gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates(tvId, seasonNumber, episodeNumber, guestSessionId, sessionId)

Get Account States

Get your rating for a episode.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
Integer episodeNumber = 56; // Integer | 
String guestSessionId = "guestSessionId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    InlineResponse20012 result = apiInstance.gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates(tvId, seasonNumber, episodeNumber, guestSessionId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberAccountStates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |
 **episodeNumber** | **Integer**|  |
 **guestSessionId** | **String**|  | [optional]
 **sessionId** | **String**|  | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds"></a>
# **gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds**
> InlineResponse20012 gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds(tvId, seasonNumber, episodeNumber)

Get External IDs

Get the external ids for a TV episode. We currently support the following external sources.  | **External Sources** | | -------------------- | | IMDb ID              | | TVDB ID              | | Freebase MID*        | | Freebase ID*         | | TVRage ID*           |  *Defunct or no longer available as a service.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
Integer episodeNumber = 56; // Integer | 
try {
    InlineResponse20012 result = apiInstance.gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds(tvId, seasonNumber, episodeNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberExternalIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |
 **episodeNumber** | **Integer**|  |

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages"></a>
# **gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages**
> InlineResponse20041 gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages(tvId, seasonNumber, episodeNumber)

Get Images

Get the images that belong to a TV episode.  Querying images with a &#x60;language&#x60; parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the &#x60;include_image_language&#x60; parameter. This should be a comma seperated value like so: &#x60;include_image_language&#x3D;en,null&#x60;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
Integer episodeNumber = 56; // Integer | 
try {
    InlineResponse20041 result = apiInstance.gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages(tvId, seasonNumber, episodeNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |
 **episodeNumber** | **Integer**|  |

### Return type

[**InlineResponse20041**](InlineResponse20041.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations"></a>
# **gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations**
> InlineResponse20035 gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations(tvId, seasonNumber, episodeNumber)

Get Translations

Get the translation data for an episode.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
Integer episodeNumber = 56; // Integer | 
try {
    InlineResponse20035 result = apiInstance.gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations(tvId, seasonNumber, episodeNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberTranslations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |
 **episodeNumber** | **Integer**|  |

### Return type

[**InlineResponse20035**](InlineResponse20035.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos"></a>
# **gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos**
> InlineResponse20016 gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos(tvId, seasonNumber, episodeNumber)

Get  Videos

Get the videos that have been added to a TV episode.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 28, 2021 | A new &#x60;include_video_language&#x60; filter is now available. You can use this filter the same way you use &#x60;include_image_language&#x60; on image calls. We also added two new fields, &#x60;official&#x60; and &#x60;published_at&#x60; to the video response. | | March 23, 2019 | Vimeo was added as a video source. | | March 20, 2019 | \&quot;Behind the Scenes\&quot;, \&quot;Bloopers\&quot; and \&quot;Recap\&quot; were added as valid video types. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
Integer episodeNumber = 56; // Integer | 
try {
    InlineResponse20016 result = apiInstance.gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos(tvId, seasonNumber, episodeNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberVideos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |
 **episodeNumber** | **Integer**|  |

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberExternalIds"></a>
# **gETTvTvIdSeasonSeasonNumberExternalIds**
> InlineResponse20012 gETTvTvIdSeasonSeasonNumberExternalIds(tvId, seasonNumber)

Get External IDs

Get the external ids for a TV season. We currently support the following external sources.  | **Media Databases** | | ------------------- | | TVDB ID             | | Freebase MID*       | | Freebase ID*        | | TVRage ID*          |  *Defunct or no longer available as a service.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
try {
    InlineResponse20012 result = apiInstance.gETTvTvIdSeasonSeasonNumberExternalIds(tvId, seasonNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberExternalIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberImages"></a>
# **gETTvTvIdSeasonSeasonNumberImages**
> InlineResponse20060 gETTvTvIdSeasonSeasonNumberImages(tvId, seasonNumber)

Get Images

Get the images that belong to a TV season.  Querying images with a &#x60;language&#x60; parameter will filter the results. If you want to include a fallback language (especially useful for backdrops) you can use the &#x60;include_image_language&#x60; parameter. This should be a comma seperated value like so: &#x60;include_image_language&#x3D;en,null&#x60;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
try {
    InlineResponse20060 result = apiInstance.gETTvTvIdSeasonSeasonNumberImages(tvId, seasonNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |

### Return type

[**InlineResponse20060**](InlineResponse20060.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberTranslations"></a>
# **gETTvTvIdSeasonSeasonNumberTranslations**
> InlineResponse20035 gETTvTvIdSeasonSeasonNumberTranslations(tvId, seasonNumber)

Get Translations

Get the credits for TV season.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
try {
    InlineResponse20035 result = apiInstance.gETTvTvIdSeasonSeasonNumberTranslations(tvId, seasonNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberTranslations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |

### Return type

[**InlineResponse20035**](InlineResponse20035.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSeasonSeasonNumberVideos"></a>
# **gETTvTvIdSeasonSeasonNumberVideos**
> InlineResponse20022 gETTvTvIdSeasonSeasonNumberVideos(tvId, seasonNumber)

Get Videos

Get the videos that have been added to a TV season.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 28, 2021 | A new &#x60;include_video_language&#x60; filter is now available. You can use this filter the same way you use &#x60;include_image_language&#x60; on image calls. We also added two new fields, &#x60;official&#x60; and &#x60;published_at&#x60; to the video response. | | March 23, 2019 | Vimeo was added as a video source. | | March 20, 2019 | \&quot;Behind the Scenes\&quot; and \&quot;Bloopers\&quot; and \&quot;Recap\&quot; were added as valid video types. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
try {
    InlineResponse20022 result = apiInstance.gETTvTvIdSeasonSeasonNumberVideos(tvId, seasonNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSeasonSeasonNumberVideos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdSimilar"></a>
# **gETTvTvIdSimilar**
> InlineResponse20011 gETTvTvIdSimilar(tvId)

Get Similar TV Shows

Get a list of similar TV shows. These items are assembled by looking at keywords and genres.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    InlineResponse20011 result = apiInstance.gETTvTvIdSimilar(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdSimilar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdTranslations"></a>
# **gETTvTvIdTranslations**
> InlineResponse20020 gETTvTvIdTranslations(tvId)

Get Translations

Get a list of the translations that exist for a TV show.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    InlineResponse20020 result = apiInstance.gETTvTvIdTranslations(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdTranslations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdVideos"></a>
# **gETTvTvIdVideos**
> InlineResponse20022 gETTvTvIdVideos(tvId)

Get Videos

Get the videos that have been added to a TV show.  #### Recent Changes  | **Date** | **Change** | | - | - | | July 28, 2021 | A new &#x60;include_video_language&#x60; filter is now available. You can use this filter the same way you use &#x60;include_image_language&#x60; on image calls. We also added two new fields, &#x60;official&#x60; and &#x60;published_at&#x60; to the video response. | | March 23, 2019 | Vimeo was added as a video source. | | March 20, 2019 | \&quot;Behind the Scenes\&quot; and \&quot;Bloopers\&quot; were added as valid video types. |

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    InlineResponse20022 result = apiInstance.gETTvTvIdVideos(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdVideos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETTvTvIdWatchProviders"></a>
# **gETTvTvIdWatchProviders**
> InlineResponse2001 gETTvTvIdWatchProviders(tvId)

Get Watch Providers

Powered by our partnership with JustWatch, you can query this method to get a list of the availabilities per country by provider.  This is **not** going to return full deep links, but rather, it&#39;s just enough information to display what&#39;s available where.  You can link to the provided TMDB URL to help support TMDB and provide the actual deep links to the content.  **Please note**: In order to use this data **you must** attribute the source of the data as JustWatch. If we find any usage not complying with these terms we will revoke access to the API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
try {
    InlineResponse2001 result = apiInstance.gETTvTvIdWatchProviders(tvId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETTvTvIdWatchProviders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETWatchProvidersMovie"></a>
# **gETWatchProvidersMovie**
> InlineResponse2006 gETWatchProvidersMovie(watchRegion)

Get Movie Providers

Returns a list of the watch provider (OTT/streaming) data we have available for movies. You can specify a &#x60;watch_region&#x60; param if you want to further filter the list by country.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String watchRegion = "watchRegion_example"; // String | Use the ISO-3166-1 code to filter the providers that are available in a particular country.
try {
    InlineResponse2006 result = apiInstance.gETWatchProvidersMovie(watchRegion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETWatchProvidersMovie");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **watchRegion** | **String**| Use the ISO-3166-1 code to filter the providers that are available in a particular country. | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETWatchProvidersRegions"></a>
# **gETWatchProvidersRegions**
> InlineResponse20073 gETWatchProvidersRegions()

Get Available Regions

Returns a list of all of the countries we have watch provider (OTT/streaming) data for.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    InlineResponse20073 result = apiInstance.gETWatchProvidersRegions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETWatchProvidersRegions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20073**](InlineResponse20073.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETWatchProvidersTv"></a>
# **gETWatchProvidersTv**
> InlineResponse2006 gETWatchProvidersTv(watchRegion)

Get TV Providers

Returns a list of the watch provider (OTT/streaming) data we have available for TV series. You can specify a &#x60;watch_region&#x60; param if you want to further filter the list by country.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String watchRegion = "watchRegion_example"; // String | Use the ISO-3166-1 code to filter the providers that are available in a particular country.
try {
    InlineResponse2006 result = apiInstance.gETWatchProvidersTv(watchRegion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETWatchProvidersTv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **watchRegion** | **String**| Use the ISO-3166-1 code to filter the providers that are available in a particular country. | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pOSTAccountAccountIdFavorite"></a>
# **pOSTAccountAccountIdFavorite**
> InlineResponse4011 pOSTAccountAccountIdFavorite(accountId, sessionId, contentType, body)

Mark as Favorite

This method allows you to mark a movie or TV show as a favorite item.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer accountId = 56; // Integer | 
String sessionId = ""; // String | 
String contentType = "application/json;charset=utf-8"; // String | 
Body10 body = new Body10(); // Body10 | 
try {
    InlineResponse4011 result = apiInstance.pOSTAccountAccountIdFavorite(accountId, sessionId, contentType, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTAccountAccountIdFavorite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**|  |
 **sessionId** | **String**|  | [default to ]
 **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8]
 **body** | [**Body10**](Body10.md)|  | [optional]

### Return type

[**InlineResponse4011**](InlineResponse4011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTAccountAccountIdWatchlist"></a>
# **pOSTAccountAccountIdWatchlist**
> InlineResponse4011 pOSTAccountAccountIdWatchlist(accountId, contentType, sessionId, body)

Add to Watchlist

Add a movie or TV show to your watchlist.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer accountId = 56; // Integer | 
String contentType = "application/json;charset=utf-8"; // String | 
String sessionId = ""; // String | 
Body11 body = new Body11(); // Body11 | 
try {
    InlineResponse4011 result = apiInstance.pOSTAccountAccountIdWatchlist(accountId, contentType, sessionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTAccountAccountIdWatchlist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**|  |
 **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8]
 **sessionId** | **String**|  | [default to ]
 **body** | [**Body11**](Body11.md)|  | [optional]

### Return type

[**InlineResponse4011**](InlineResponse4011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTAuthenticationSessionConvert4"></a>
# **pOSTAuthenticationSessionConvert4**
> InlineResponse2005 pOSTAuthenticationSessionConvert4(body)

Create Session (from v4 access token)

Use this method to create a v3 session ID if you already have a valid v4 access token. The v4 token needs to be authenticated by the user. Your standard \&quot;read token\&quot; will not validate to create a session ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Body body = new Body(); // Body | 
try {
    InlineResponse2005 result = apiInstance.pOSTAuthenticationSessionConvert4(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTAuthenticationSessionConvert4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body**](Body.md)|  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTAuthenticationSessionNew"></a>
# **pOSTAuthenticationSessionNew**
> InlineResponse2005 pOSTAuthenticationSessionNew(body)

Create Session

You can use this method to create a fully valid session ID once a user has validated the request token. More information about how this works can be found [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Body8 body = new Body8(); // Body8 | 
try {
    InlineResponse2005 result = apiInstance.pOSTAuthenticationSessionNew(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTAuthenticationSessionNew");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body8**](Body8.md)|  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTAuthenticationTokenValidateWithLogin"></a>
# **pOSTAuthenticationTokenValidateWithLogin**
> InlineResponse20025 pOSTAuthenticationTokenValidateWithLogin(body)

Create Session With Login

This method allows an application to validate a request token by entering a username and password.  Not all applications have access to a web view so this can be used as a substitute.  Please note, the preferred method of validating a request token is to have a user authenticate the request via the TMDB website. You can read about that method [here](#docTextSection:NSZtgz7zptsiLYxXZ).  If you decide to use this method please **use HTTPS**.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Body3 body = new Body3(); // Body3 | 
try {
    InlineResponse20025 result = apiInstance.pOSTAuthenticationTokenValidateWithLogin(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTAuthenticationTokenValidateWithLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body3**](Body3.md)|  | [optional]

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTList"></a>
# **pOSTList**
> InlineResponse201 pOSTList(contentType, sessionId, body)

Create List

Create a list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String contentType = "application/json;charset=utf-8"; // String | 
String sessionId = ""; // String | 
Body2 body = new Body2(); // Body2 | 
try {
    InlineResponse201 result = apiInstance.pOSTList(contentType, sessionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8]
 **sessionId** | **String**|  | [default to ]
 **body** | [**Body2**](Body2.md)|  | [optional]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTListListIdAddItem"></a>
# **pOSTListListIdAddItem**
> InlineResponse4011 pOSTListListIdAddItem(listId, contentType, sessionId, body)

Add Movie

Add a movie to a list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String listId = "listId_example"; // String | 
String contentType = "application/json;charset=utf-8"; // String | 
String sessionId = ""; // String | 
Body6 body = new Body6(); // Body6 | 
try {
    InlineResponse4011 result = apiInstance.pOSTListListIdAddItem(listId, contentType, sessionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTListListIdAddItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **String**|  |
 **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8]
 **sessionId** | **String**|  | [default to ]
 **body** | [**Body6**](Body6.md)|  | [optional]

### Return type

[**InlineResponse4011**](InlineResponse4011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTListListIdClear"></a>
# **pOSTListListIdClear**
> InlineResponse4011 pOSTListListIdClear(listId, confirm, sessionId)

Clear List

Clear all of the items from a list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String listId = "listId_example"; // String | 
Boolean confirm = true; // Boolean | 
String sessionId = ""; // String | 
try {
    InlineResponse4011 result = apiInstance.pOSTListListIdClear(listId, confirm, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTListListIdClear");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **String**|  |
 **confirm** | **Boolean**|  |
 **sessionId** | **String**|  | [default to ]

### Return type

[**InlineResponse4011**](InlineResponse4011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pOSTListListIdRemoveItem"></a>
# **pOSTListListIdRemoveItem**
> InlineResponse4011 pOSTListListIdRemoveItem(listId, contentType, sessionId, body)

Remove Movie

Remove a movie from a list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String listId = "listId_example"; // String | 
String contentType = "application/json;charset=utf-8"; // String | 
String sessionId = ""; // String | 
Body9 body = new Body9(); // Body9 | 
try {
    InlineResponse4011 result = apiInstance.pOSTListListIdRemoveItem(listId, contentType, sessionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTListListIdRemoveItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | **String**|  |
 **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8]
 **sessionId** | **String**|  | [default to ]
 **body** | [**Body9**](Body9.md)|  | [optional]

### Return type

[**InlineResponse4011**](InlineResponse4011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTMovieMovieIdRating"></a>
# **pOSTMovieMovieIdRating**
> InlineResponse4011 pOSTMovieMovieIdRating(movieId, contentType, body, guestSessionId, sessionId)

Rate Movie

Rate a movie.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer movieId = 56; // Integer | 
String contentType = "application/json;charset=utf-8"; // String | 
Body7 body = new Body7(); // Body7 | 
String guestSessionId = "guestSessionId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    InlineResponse4011 result = apiInstance.pOSTMovieMovieIdRating(movieId, contentType, body, guestSessionId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTMovieMovieIdRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **movieId** | **Integer**|  |
 **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8]
 **body** | [**Body7**](Body7.md)|  | [optional]
 **guestSessionId** | **String**|  | [optional]
 **sessionId** | **String**|  | [optional]

### Return type

[**InlineResponse4011**](InlineResponse4011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTTvTvIdRating"></a>
# **pOSTTvTvIdRating**
> InlineResponse4011 pOSTTvTvIdRating(tvId, contentType, body, guestSessionId, sessionId)

Rate TV Show

Rate a TV show.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
String contentType = "application/json;charset=utf-8"; // String | 
Body1 body = new Body1(); // Body1 | 
String guestSessionId = "guestSessionId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    InlineResponse4011 result = apiInstance.pOSTTvTvIdRating(tvId, contentType, body, guestSessionId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTTvTvIdRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8]
 **body** | [**Body1**](Body1.md)|  | [optional]
 **guestSessionId** | **String**|  | [optional]
 **sessionId** | **String**|  | [optional]

### Return type

[**InlineResponse4011**](InlineResponse4011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating"></a>
# **pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating**
> InlineResponse4011 pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating(tvId, seasonNumber, episodeNumber, contentType, body, guestSessionId, sessionId)

Rate TV Episode

Rate a TV episode.  A valid session or guest session ID is required. You can read more about how this works [here](#docTextSection:NSZtgz7zptsiLYxXZ).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
Integer tvId = 56; // Integer | 
Integer seasonNumber = 56; // Integer | 
Integer episodeNumber = 56; // Integer | 
String contentType = "application/json;charset=utf-8"; // String | 
Body4 body = new Body4(); // Body4 | 
String guestSessionId = "guestSessionId_example"; // String | 
String sessionId = "sessionId_example"; // String | 
try {
    InlineResponse4011 result = apiInstance.pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating(tvId, seasonNumber, episodeNumber, contentType, body, guestSessionId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pOSTTvTvIdSeasonSeasonNumberEpisodeEpisodeNumberRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tvId** | **Integer**|  |
 **seasonNumber** | **Integer**|  |
 **episodeNumber** | **Integer**|  |
 **contentType** | **String**|  | [default to application/json;charset&#x3D;utf-8]
 **body** | [**Body4**](Body4.md)|  | [optional]
 **guestSessionId** | **String**|  | [optional]
 **sessionId** | **String**|  | [optional]

### Return type

[**InlineResponse4011**](InlineResponse4011.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

