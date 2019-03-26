package it.marco.lastminute.converter;

import it.marco.lastminute.dao.DaoInterface;
import it.marco.lastminute.dao.MusicCDDao;
import it.marco.lastminute.dto.MusicCD;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MusicCDConverter implements ConverterFromDaoToItemInterface<MusicCD> {

	public List<MusicCD> convertList(List<DaoInterface> daoList) {

		List<MusicCD> results = new ArrayList<MusicCD>();

		if (daoList != null && ! daoList.isEmpty()) {

			MusicCDConverter converter = new MusicCDConverter();

			results = daoList.stream()
					.map(converter::convert)
					.collect(Collectors.toList());
		}

		return results;
	}

	public MusicCD convert(DaoInterface dao) {

		MusicCD musicCD = null;

		if (dao != null && dao instanceof MusicCDDao) {

			MusicCDDao musicCDDao = (MusicCDDao) dao;

			musicCD = new MusicCD(musicCDDao.getAmount(), musicCDDao.getImported());
		}

		return musicCD;
	}
}
