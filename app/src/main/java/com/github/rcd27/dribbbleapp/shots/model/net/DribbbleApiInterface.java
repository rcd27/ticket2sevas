package com.github.rcd27.dribbbleapp.shots.model.net;


import java.util.List;

import io.reactivex.Single;
import com.github.rcd27.dribbbleapp.shots.model.objects.ShotDataTransferObject;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DribbbleApiInterface {
    @GET("shots")
    Single<List<ShotDataTransferObject>> getShots(@Query("page") int pageNumber,
                                                  @Query("per_page") int shotsPerPage);
}