#ifndef PHOTO_LINEUP_H
#define PHOTO_LINEUP_H
#include <vector>
#include <algorithm>
#include <iostream>

void permute(std::vector<std::string> list_of_names)
{
	std::sort(list_of_names.begin(), list_of_names.end());

    do
    {
        for (auto names : list_of_names) std::cout << names << ' ';
	std::cout << std::endl;
    } while (std::next_permutation(list_of_names.begin(), list_of_names.end()));
}

#endif
