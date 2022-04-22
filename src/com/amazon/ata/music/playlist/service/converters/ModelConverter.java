package com.amazon.ata.music.playlist.service.converters;

import com.amazon.ata.music.playlist.service.dynamodb.models.AlbumTrack;
import com.amazon.ata.music.playlist.service.models.PlaylistModel;
import com.amazon.ata.music.playlist.service.dynamodb.models.Playlist;
import com.amazon.ata.music.playlist.service.models.SongModel;

import java.util.ArrayList;
import java.util.List;

public class ModelConverter {
    /**
     * Converts a provided {@link Playlist} into a {@link PlaylistModel} representation.
     * @param playlist the playlist to convert
     * @return the converted playlist
     */
    public PlaylistModel toPlaylistModel(Playlist playlist) {
        List<String> tags;
        if (playlist.getTags() == null) {
            tags = null;
        } else {
            tags = new ArrayList<>(playlist.getTags());
        }
        return PlaylistModel.builder()
            .withId(playlist.getId())
                .withName(playlist.getName())
                .withCustomerId(playlist.getCustomerId())
                .withSongCount(playlist.getSongCount())
                .withTags(tags)
            .build();
    }
    public List<SongModel> toSongModelList(List<AlbumTrack> albumTracks) {
        List<SongModel> songModelList = new ArrayList<>();
        for (AlbumTrack track: albumTracks) {
            SongModel model = SongModel.builder()
                    .withAlbum(track.getAlbumName())
                    .withAsin(track.getAsin())
                    .withTitle(track.getSongTitle())
                    .withTrackNumber(track.getTrackNumber())
                    .build();
            songModelList.add(model);
        }
        return songModelList;
    }
}
