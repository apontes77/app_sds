export type GamePlatform = 'XBOX' | 'PlayStation' | 'PC'

export type Game = {
    id: number
    title: string
    platform: GamePlatform
    label: string
    value: number
}