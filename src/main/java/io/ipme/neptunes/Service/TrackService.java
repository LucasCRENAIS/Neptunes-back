package io.ipme.neptunes.Service;

import io.ipme.neptunes.Model.Track;
import io.ipme.neptunes.Repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackService {

    @Autowired
    private TrackRepository trackRepository;

    public List<Track> findAll(){
        return trackRepository.findAll();
    }

    public Optional<Track> findOne(Integer id){
        return trackRepository.findById(id);
    }

    public void save(Track track){
        trackRepository.saveAndFlush(track);
    }

    public void remove(Integer id){
        trackRepository.deleteById(id);
    }

    public void update(Track track, Integer id){
        Track trackToUpdate  = trackRepository.getById(id);
        trackToUpdate.setTrackName(track.getTrackName());
        trackToUpdate.setTrackAuthor(track.getTrackAuthor());
        trackToUpdate.setTrackURL(track.getTrackURL());
        trackToUpdate.setTrackReleaseYear(track.getTrackReleaseYear());
        trackToUpdate.setPlaylist(track.getPlaylist());
        trackRepository.save(trackToUpdate);
    }
}
